package com.self.practice.DesignPartten;

public class GetPlan {
    public Plan getPlan(String planType)
    {
        if(planType==null)
            return null;
        if(planType.equalsIgnoreCase("domesticPlan"))
            return new DomesticPlan();
        else if(planType.equalsIgnoreCase("commercialPlan"))
            return new CommercialPlan();
        else if(planType.equalsIgnoreCase("institutionPaln"))
            return new InstitutePlan();


        return null;
    }
}
