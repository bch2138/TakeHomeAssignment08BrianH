package com.example.uhylabr.takehomeassignment08_brianh;

public class Questions {

    public Questions(int location, int question, int photoId, boolean isTrue) {
        this.location = location;
        this.question = question;
        this.photoId = photoId;
        this.isTrue = isTrue;
    }

    public int location;
    public int question;
    public int photoId;
    public boolean isTrue;

    public int getLocation(){return location;}

    public void setLocation(int location){this.location=location;}

    public int getQuestion(){return question;}

    public void setQuestion(int question){this.question=question;}

    public int getPhotoId(){return photoId;}

    public void setPhotoId(int photoId){this.photoId=photoId;}

    public boolean isTrue() {return isTrue;}

    public void setTrue(boolean aTrue){isTrue=aTrue;}
}

