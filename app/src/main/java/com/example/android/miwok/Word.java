package com.example.android.miwok;

/**
 * Created by JS IID on 6/8/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private Integer mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    public  Word (String defaultTranslation,String miwokTranslation,int ImageResourceId,int AudioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId= AudioResourceId;
    }

    public Word (String defaultTranslation,String miwokTranslation,int AudioRecourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = AudioRecourceId;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String  getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public int getImageResourceId() {return mImageResourceId;}
    public Boolean hasImage() {return mImageResourceId != NO_IMAGE_PROVIDED;}
    public int getAudioResourceId (){return mAudioResourceId;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
