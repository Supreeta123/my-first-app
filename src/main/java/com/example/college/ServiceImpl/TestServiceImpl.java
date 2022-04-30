package com.example.college.ServiceImpl;


import com.example.college.Services.TestService;
import com.example.college.entity.User;
import com.example.college.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl<user> implements TestService {


    @Autowired
    private UserDAO userDAO;

//    @Override
//    public ProductDetails getProductDetails(int tatoId) {
//        Optional<Tato> tato = productDAO.findById(tatoId);
//
//      Tato tato1 = tato.get();
//    ProductDetails productDetails = new ProductDetails();
//
//    productDetails.setId(tato1.getId());
//    productDetails.setName(tato1.getName());
//    productDetails.setType(tato1.getType());
//    productDetails.setPrice(tato1.getPrice());
//    productDetails.setDetails(tato1.getDetails());
//    return productDetails;
//    }

//    @Override
//    public ReviewResponse getReviewResponse(int tatoId) {
//        List<ReviewResponse> reviewResponsesList= new ArrayList<>();
//
//        ReviewResponse reviewResponse = new ReviewResponse();
//
//        reviewResponse.setReviewerName("best");
//        reviewResponse.setReview("jaan");
//        reviewResponse.setRating("5");
//
//
//        reviewResponse.setReviewerName("banu");
//        reviewResponse.setReview("mazza");
//        reviewResponse.setRating("54");
//
//
//        reviewResponsesList.add(reviewResponse);
//        reviewResponsesList.add(reviewResponse);
//        return reviewResponse;
//    }



    //    public ReviewResponse getReviewResponse(int tatoId) {
//
    @Override
    public User getUserDetails(String userName, int userId) {

        User user = new User();

        User userDetails = userDAO.findByNameAndId(userName,userId);

//        User userDetails1 = new User();

       user.setId(userDetails.getId());
        user.setName(userDetails.getName());
        user.setAge(userDetails.getAge());

        return user;

    }
}






//    List<ReviewResponse> reviewResponsesList= new ArrayList<>();
//        reviewResponse.setReviewerName("anu");
//                reviewResponse.setReviewerName("best");
//                reviewResponse.setRating("5");
//                reviewResponsesList.add(reviewResponse);