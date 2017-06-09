/**
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage
 * @generated
 */
public interface RouterDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RouterDslFactory eINSTANCE = fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.impl.RouterDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Routing Rules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Routing Rules</em>'.
   * @generated
   */
  RoutingRules createRoutingRules();

  /**
   * Returns a new object of class '<em>Data Source Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Source Declaration</em>'.
   * @generated
   */
  DataSourceDeclaration createDataSourceDeclaration();

  /**
   * Returns a new object of class '<em>Processor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Processor Declaration</em>'.
   * @generated
   */
  ProcessorDeclaration createProcessorDeclaration();

  /**
   * Returns a new object of class '<em>System Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Declaration</em>'.
   * @generated
   */
  SystemDeclaration createSystemDeclaration();

  /**
   * Returns a new object of class '<em>Case Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Rule</em>'.
   * @generated
   */
  CaseRule createCaseRule();

  /**
   * Returns a new object of class '<em>Decision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decision</em>'.
   * @generated
   */
  Decision createDecision();

  /**
   * Returns a new object of class '<em>Message Decision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Decision</em>'.
   * @generated
   */
  MessageDecision createMessageDecision();

  /**
   * Returns a new object of class '<em>Route To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Route To</em>'.
   * @generated
   */
  RouteTo createRouteTo();

  /**
   * Returns a new object of class '<em>Drop Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Message</em>'.
   * @generated
   */
  DropMessage createDropMessage();

  /**
   * Returns a new object of class '<em>Alert</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alert</em>'.
   * @generated
   */
  Alert createAlert();

  /**
   * Returns a new object of class '<em>Conditional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional</em>'.
   * @generated
   */
  Conditional createConditional();

  /**
   * Returns a new object of class '<em>Object Access Or Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Access Or Value</em>'.
   * @generated
   */
  ObjectAccessOrValue createObjectAccessOrValue();

  /**
   * Returns a new object of class '<em>Literal Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Value</em>'.
   * @generated
   */
  LiteralValue createLiteralValue();

  /**
   * Returns a new object of class '<em>Throughtput</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Throughtput</em>'.
   * @generated
   */
  Throughtput createThroughtput();

  /**
   * Returns a new object of class '<em>Temperature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Temperature</em>'.
   * @generated
   */
  Temperature createTemperature();

  /**
   * Returns a new object of class '<em>Object Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Access</em>'.
   * @generated
   */
  ObjectAccess createObjectAccess();

  /**
   * Returns a new object of class '<em>Processor Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Processor Access</em>'.
   * @generated
   */
  ProcessorAccess createProcessorAccess();

  /**
   * Returns a new object of class '<em>Sensor Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor Access</em>'.
   * @generated
   */
  SensorAccess createSensorAccess();

  /**
   * Returns a new object of class '<em>System Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Access</em>'.
   * @generated
   */
  SystemAccess createSystemAccess();

  /**
   * Returns a new object of class '<em>Routing Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Routing Rule</em>'.
   * @generated
   */
  RoutingRule createRoutingRule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RouterDslPackage getRouterDslPackage();

} //RouterDslFactory