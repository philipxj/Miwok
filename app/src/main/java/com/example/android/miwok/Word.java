package com.example.android.miwok;

/**
 * represents a vocabulary word that the user wants to learn
 * it  contains a default translation and a Miwok translation for that word.
 */
public class Word {
    //Default translation for the word
    private String mDefaultTranslation;
    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;
    private String mMiwokTranslation;
    private int mImageResourceId;
    public static final int NO_IMAGE_PROVIDED = -1;


    /**
     * @param defaultTranslation is the word in a language that the user is default language
     * @param miwokTranslation   in the word in the Miwok language
     *                           ImageRessourceID is the drawable resource ID for the image
     * @param audioResourceId    is the resource ID for the audio file associated with this word.
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceID;
        mAudioResourceId = audioResourceId;
    }

public int getmAudioResourceId(){
        return mAudioResourceId;
}
    /**
     * get the default translation of the word.
     *
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    /**
     * @return the image resource ID of the word
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    @Override
    public String toString() {
        return "Word{"+"mDefaultTranslation=' "+ mDefaultTranslation+ " / " + ", mMiwokTranslation=' " +mMiwokTranslation + "/ "+ ", mAudioResourceID= "
                    + mAudioResourceId+ ", mImageResourceID="+mImageResourceId+"}";
    }

}

