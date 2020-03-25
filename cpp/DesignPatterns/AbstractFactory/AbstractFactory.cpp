/** @file   AbstractFactory.cpp
 *  @brief  抽象工厂
 *  @note
 *  @author lesliefish
 *  @date   2020/03/25
 */

#include <iostream>
 /*
  * class   ProductA
  * @brief  Product A;Product实现相同的接口getName()，以便类可以引用接口而不是具体的Product
  */
class ProductA
{
public:
    virtual ~ProductA() {};
    virtual const char* getName() = 0;
};

/*
 * class   ConcreteProductAX 和 ConcreteProductAY
 * @brief  工厂创建出的具体对象类型
 */
class ConcreteProductAX : public ProductA
{
public:
    ~ConcreteProductAX() {};
    const char* getName() { return "A-X"; }
};

class ConcreteProductAY : public ProductA
{
public:
    ~ConcreteProductAY() {};
    const char* getName() { return "A-Y"; }
};

/*
 * class   ProductB
 * @brief  参考Product A;
 */
class ProductB
{
public:
    virtual ~ProductB() {};
    virtual const char* getName() = 0;
};


class ConcreteProductBX : public ProductB
{
public:
    ~ConcreteProductBX() {};
    const char* getName() { return "B-X"; }
};

class ConcreteProductBY : public ProductB
{
public:
    ~ConcreteProductBY() {};
    const char* getName() { return "B-Y"; }
};


/*
 * class   AbstractFactory
 * @brief  提供用于创建产品系列的抽象接口
 */
class AbstractFactory
{
public:
    virtual ~AbstractFactory() {}

    virtual ProductA* createProductA() = 0;
    virtual ProductB* createProductB() = 0;
};

/*
 * class   ConcreteFactoryX 和 ConcreteFactoryY
 * @brief  每个具体的工厂都创建一个产品系列，客户端使用其中一个工厂，因此它不必实例化产品对象
 */
class ConcreteFactoryX : public AbstractFactory
{
public:
    ~ConcreteFactoryX() {};

    ProductA* createProductA() { return new ConcreteProductAX(); }
    ProductB* createProductB() { return new ConcreteProductBX(); }
};

class ConcreteFactoryY : public AbstractFactory
{
public:
    ~ConcreteFactoryY() {};

    ProductA* createProductA() { return new ConcreteProductAY(); }
    ProductB* createProductB() { return new ConcreteProductBY(); }
};


/*
 * @func   main
 * @brief  测试
 * @return int
 */
int main()
{
    ConcreteFactoryX* factoryX = new ConcreteFactoryX();
    ConcreteFactoryY* factoryY = new ConcreteFactoryY();

    ProductA* pXA = factoryX->createProductA();
    std::cout << "Product: " << pXA->getName() << std::endl;

    ProductB* pXB = factoryX->createProductB();
    std::cout << "Product: " << pXB->getName() << std::endl;


    ProductA* pYA = factoryY->createProductA();
    std::cout << "Product: " << pYA->getName() << std::endl;

    ProductB* pYB = factoryY->createProductB();
    std::cout << "Product: " << pYB->getName() << std::endl;


    delete pXA; pXA = nullptr;
    delete pXB; pXB = nullptr;
    delete pYA; pYA = nullptr;
    delete pYB; pYB = nullptr;

    delete factoryX; factoryX = nullptr;
    delete factoryY; factoryY = nullptr;

    return 0;
}