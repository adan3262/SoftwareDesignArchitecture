const PaymentService = {
    makePayment: async (learner, course) => {
      console.log(
        `Processing payment for ${learner.name} to enroll in ${course.title}`
      );
  
      // Simulated success
      return new Promise((resolve) =>
        setTimeout(() => resolve({ success: true }), 1000)
      );
    },
  };
  
  export default PaymentService;
  