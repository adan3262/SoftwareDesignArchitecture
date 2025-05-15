import PaymentService from "./PaymentService";

const EnrollmentService = {
  enrollInCourse: async (course) => {
    const learner = { id: 1, name: "John Doe" }; // Simulated current user

    const paymentResult = await PaymentService.makePayment(learner, course);
    if (paymentResult.success) {
      console.log("Enrollment added for", learner.name);
      return true;
    } else {
      return false;
    }
  },
};

export default EnrollmentService;
