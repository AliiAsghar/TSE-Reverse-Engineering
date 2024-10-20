package com.google.android.ims.rcsservice.businessinfo;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ahby;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessInfoMetadataRetrievalResponse extends ahby {
    private static final int ERROR_PERSISTING_METADATA = 201;
    private static final int ERROR_REQUEST_CONNECTION_FAILED = 203;
    private static final int ERROR_REQUEST_TIMEOUT = 202;
    public static final BusinessInfoMetadataRetrievalResponse SUCCESS_RESULT = new BusinessInfoMetadataRetrievalResponse(0);
    public static final BusinessInfoMetadataRetrievalResponse ERROR_PERSISTING_METADATA_RESULT = new BusinessInfoMetadataRetrievalResponse(201);
    public static final BusinessInfoMetadataRetrievalResponse ERROR_REQUEST_TIMEOUT_RESULT = new BusinessInfoMetadataRetrievalResponse(202);
    public static final BusinessInfoMetadataRetrievalResponse ERROR_REQUEST_CONNECTION_FAILED_RESULT = new BusinessInfoMetadataRetrievalResponse(203);
    private static final int ERROR_INVALID_JSON = 204;
    public static final BusinessInfoMetadataRetrievalResponse ERROR_INVALID_JSON_RESULT = new BusinessInfoMetadataRetrievalResponse(ERROR_INVALID_JSON);
    public static final BusinessInfoMetadataRetrievalResponse ERROR_UNKNOWN_RESULT = new BusinessInfoMetadataRetrievalResponse(1);
    public static final Parcelable.Creator<BusinessInfoMetadataRetrievalResponse> CREATOR = new Parcelable.Creator<BusinessInfoMetadataRetrievalResponse>() { // from class: com.google.android.ims.rcsservice.businessinfo.BusinessInfoMetadataRetrievalResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BusinessInfoMetadataRetrievalResponse createFromParcel(Parcel parcel) {
            return new BusinessInfoMetadataRetrievalResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BusinessInfoMetadataRetrievalResponse[] newArray(int i) {
            return new BusinessInfoMetadataRetrievalResponse[i];
        }
    };

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ResultCode {
    }

    private BusinessInfoMetadataRetrievalResponse(int i) {
        this.code = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.description);
    }

    public BusinessInfoMetadataRetrievalResponse(Parcel parcel) {
        this.code = parcel.readInt();
        this.description = parcel.readString();
    }
}
