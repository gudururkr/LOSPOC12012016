package madhu.lospoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class VehicleCarDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "VEHICLECARDETAILS_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "VEHICLECARDETAILS_ID_GENERATOR", sequenceName = "VEHICLECARDETAILS_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Vehicle Chasis No")
   private java.lang.String vehicleChasisNo;

   @org.kie.api.definition.type.Label("Current Milage /Km")
   private java.lang.Double vehicleCurrentMilage;

   @org.kie.api.definition.type.Label("Engine Size")
   private java.lang.String vehicleEngineSize;

   @org.kie.api.definition.type.Label("Evaluation Price")
   private java.lang.Double vehicleEvaluationPrice;

   @org.kie.api.definition.type.Label("Dealer / Vehicle Evaluator’s Name")
   private java.lang.String vehicleEvaluatorsName;

   @org.kie.api.definition.type.Label("Insurance Company Name")
   private java.lang.String vehicleInsuranceCompanyName;

   @org.kie.api.definition.type.Label("Vehicle Make")
   private java.lang.String vehicleMake;

   @org.kie.api.definition.type.Label("Vehicle Model")
   private java.lang.String vehicleModel;

   @org.kie.api.definition.type.Label("Vehicle Price")
   private java.lang.Double vehiclePrice;

   @org.kie.api.definition.type.Label("Vehicle Supplier")
   private java.lang.String vehicleSupplier;

   @org.kie.api.definition.type.Label("Vehicle Type")
   private java.lang.String vehicleType;

   @org.kie.api.definition.type.Label("Dealer Location (Emirates)")
   private java.lang.String vehicleDealerLocation;

   @org.kie.api.definition.type.Label("Year of Model")
   private java.lang.Integer vehicleYearOfModel;

   public VehicleCarDetails()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getVehicleChasisNo()
   {
      return this.vehicleChasisNo;
   }

   public void setVehicleChasisNo(java.lang.String vehicleChasisNo)
   {
      this.vehicleChasisNo = vehicleChasisNo;
   }

   public java.lang.Double getVehicleCurrentMilage()
   {
      return this.vehicleCurrentMilage;
   }

   public void setVehicleCurrentMilage(java.lang.Double vehicleCurrentMilage)
   {
      this.vehicleCurrentMilage = vehicleCurrentMilage;
   }

   public java.lang.String getVehicleEngineSize()
   {
      return this.vehicleEngineSize;
   }

   public void setVehicleEngineSize(java.lang.String vehicleEngineSize)
   {
      this.vehicleEngineSize = vehicleEngineSize;
   }

   public java.lang.Double getVehicleEvaluationPrice()
   {
      return this.vehicleEvaluationPrice;
   }

   public void setVehicleEvaluationPrice(
         java.lang.Double vehicleEvaluationPrice)
   {
      this.vehicleEvaluationPrice = vehicleEvaluationPrice;
   }

   public java.lang.String getVehicleEvaluatorsName()
   {
      return this.vehicleEvaluatorsName;
   }

   public void setVehicleEvaluatorsName(java.lang.String vehicleEvaluatorsName)
   {
      this.vehicleEvaluatorsName = vehicleEvaluatorsName;
   }

   public java.lang.String getVehicleInsuranceCompanyName()
   {
      return this.vehicleInsuranceCompanyName;
   }

   public void setVehicleInsuranceCompanyName(
         java.lang.String vehicleInsuranceCompanyName)
   {
      this.vehicleInsuranceCompanyName = vehicleInsuranceCompanyName;
   }

   public java.lang.String getVehicleMake()
   {
      return this.vehicleMake;
   }

   public void setVehicleMake(java.lang.String vehicleMake)
   {
      this.vehicleMake = vehicleMake;
   }

   public java.lang.String getVehicleModel()
   {
      return this.vehicleModel;
   }

   public void setVehicleModel(java.lang.String vehicleModel)
   {
      this.vehicleModel = vehicleModel;
   }

   public java.lang.Double getVehiclePrice()
   {
      return this.vehiclePrice;
   }

   public void setVehiclePrice(java.lang.Double vehiclePrice)
   {
      this.vehiclePrice = vehiclePrice;
   }

   public java.lang.String getVehicleSupplier()
   {
      return this.vehicleSupplier;
   }

   public void setVehicleSupplier(java.lang.String vehicleSupplier)
   {
      this.vehicleSupplier = vehicleSupplier;
   }

   public java.lang.String getVehicleType()
   {
      return this.vehicleType;
   }

   public void setVehicleType(java.lang.String vehicleType)
   {
      this.vehicleType = vehicleType;
   }

   public java.lang.String getVehicleDealerLocation()
   {
      return this.vehicleDealerLocation;
   }

   public void setVehicleDealerLocation(java.lang.String vehicleDealerLocation)
   {
      this.vehicleDealerLocation = vehicleDealerLocation;
   }

   public java.lang.Integer getVehicleYearOfModel()
   {
      return this.vehicleYearOfModel;
   }

   public void setVehicleYearOfModel(java.lang.Integer vehicleYearOfModel)
   {
      this.vehicleYearOfModel = vehicleYearOfModel;
   }

   public VehicleCarDetails(java.lang.Long id, java.lang.String vehicleChasisNo,
         java.lang.Double vehicleCurrentMilage,
         java.lang.String vehicleEngineSize,
         java.lang.Double vehicleEvaluationPrice,
         java.lang.String vehicleEvaluatorsName,
         java.lang.String vehicleInsuranceCompanyName,
         java.lang.String vehicleMake, java.lang.String vehicleModel,
         java.lang.Double vehiclePrice, java.lang.String vehicleSupplier,
         java.lang.String vehicleType, java.lang.String vehicleDealerLocation,
         java.lang.Integer vehicleYearOfModel)
   {
      this.id = id;
      this.vehicleChasisNo = vehicleChasisNo;
      this.vehicleCurrentMilage = vehicleCurrentMilage;
      this.vehicleEngineSize = vehicleEngineSize;
      this.vehicleEvaluationPrice = vehicleEvaluationPrice;
      this.vehicleEvaluatorsName = vehicleEvaluatorsName;
      this.vehicleInsuranceCompanyName = vehicleInsuranceCompanyName;
      this.vehicleMake = vehicleMake;
      this.vehicleModel = vehicleModel;
      this.vehiclePrice = vehiclePrice;
      this.vehicleSupplier = vehicleSupplier;
      this.vehicleType = vehicleType;
      this.vehicleDealerLocation = vehicleDealerLocation;
      this.vehicleYearOfModel = vehicleYearOfModel;
   }

}