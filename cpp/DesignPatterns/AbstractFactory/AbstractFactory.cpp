/** @file   AbstractFactory.cpp
 *  @brief  ���󹤳�
 *  @note
 *  @author lesliefish
 *  @date   2020/03/25
 */

#include <iostream>
 /*
  * class   ProductA
  * @brief  Product A;Productʵ����ͬ�Ľӿ�getName()���Ա���������ýӿڶ����Ǿ����Product
  */
class ProductA
{
public:
    virtual ~ProductA() {};
    virtual const char* getName() = 0;
};

/*
 * class   ConcreteProductAX �� ConcreteProductAY
 * @brief  �����������ľ����������
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
 * @brief  �ο�Product A;
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
 * @brief  �ṩ���ڴ�����Ʒϵ�еĳ���ӿ�
 */
class AbstractFactory
{
public:
    virtual ~AbstractFactory() {}

    virtual ProductA* createProductA() = 0;
    virtual ProductB* createProductB() = 0;
};

/*
 * class   ConcreteFactoryX �� ConcreteFactoryY
 * @brief  ÿ������Ĺ���������һ����Ʒϵ�У��ͻ���ʹ������һ�����������������ʵ������Ʒ����
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
 * @brief  ����
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