package defpackage;

import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.iid.MessengerCompat;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;
import com.google.android.gms.kids.GetParentVerificationIntentResponse;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.RequestContext;
import com.google.android.gms.kids.TrustedContactsRequest;
import com.google.android.gms.kids.UriWithType;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationAvailabilityRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbp implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acbp(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 545
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r32) {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acbp.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MessengerCompat[i];
            case 1:
                return new UserAddress[i];
            case 2:
                return new GetParentVerificationIntentRequest[i];
            case 3:
                return new GetParentVerificationIntentResponse[i];
            case 4:
                return new IndividualContactRequest[i];
            case 5:
                return new RequestContext[i];
            case 6:
                return new TrustedContactsRequest[i];
            case 7:
                return new UriWithType[i];
            case 8:
                return new ClientIdentity[i];
            case 9:
                return new ActivityRecognitionRequest[i];
            case 10:
                return new ActivityRecognitionResult[i];
            case 11:
                return new ActivityTransition[i];
            case 12:
                return new ActivityTransitionRequest[i];
            case 13:
                return new CurrentLocationRequest[i];
            case 14:
                return new DetectedActivity[i];
            case 15:
                return new DeviceOrientation[i];
            case 16:
                return new DeviceOrientationRequest[i];
            case 17:
                return new GeofencingRequest[i];
            case 18:
                return new LastLocationRequest[i];
            case 19:
                return new LocationAvailability[i];
            default:
                return new LocationAvailabilityRequest[i];
        }
    }
}
