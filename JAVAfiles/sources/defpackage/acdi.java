package defpackage;

import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.NlpLocationRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.UserPreferredSleepWindow;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.location.internal.RemoveGeofencingRequest;
import com.google.android.gms.location.internal.SetGoogleLocationAccuracyRequest;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.SendDataRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdi implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acdi(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 550
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acdi.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new LocationSettingsRequest[i];
            case 1:
                return new LocationResult[i];
            case 2:
                return new LocationSettingsResult[i];
            case 3:
                return new LocationSettingsStates[i];
            case 4:
                return new NetworkLocationStatus[i];
            case 5:
                return new NlpLocationRequest[i];
            case 6:
                return new SleepSegmentRequest[i];
            case 7:
                return new UserPreferredSleepWindow[i];
            case 8:
                return new DeviceOrientationRequestInternal[i];
            case 9:
                return new DeviceOrientationRequestUpdateData[i];
            case 10:
                return new FusedLocationProviderResult[i];
            case 11:
                return new LocationReceiver[i];
            case 12:
                return new LocationRequestInternal[i];
            case 13:
                return new LocationRequestUpdateData[i];
            case 14:
                return new ParcelableGeofence[i];
            case 15:
                return new RemoveGeofencingRequest[i];
            case 16:
                return new SetGoogleLocationAccuracyRequest[i];
            case 17:
                return new PlaceReport[i];
            case 18:
                return new OptInRequest[i];
            case 19:
                return new ReportingState[i];
            default:
                return new SendDataRequest[i];
        }
    }
}
