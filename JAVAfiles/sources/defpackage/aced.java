package defpackage;

import android.os.Parcelable;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.FeatureStyle;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PinConfig;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aced implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aced(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 583
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r29) {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aced.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new UploadRequest[i];
            case 1:
                return new UlrPrivateModeRequest[i];
            case 2:
                return new UploadRequestResult[i];
            case 3:
                return new StreetViewPanoramaOptions[i];
            case 4:
                return new CameraPosition[i];
            case 5:
                return new Cap[i];
            case 6:
                return new CircleOptions[i];
            case 7:
                return new FeatureLayerOptions[i];
            case 8:
                return new FeatureStyle[i];
            case 9:
                return new PinConfig.Glyph[i];
            case 10:
                return new GroundOverlayOptions[i];
            case 11:
                return new LatLngBounds[i];
            case 12:
                return new LatLng[i];
            case 13:
                return new MapStyleOptions[i];
            case 14:
                return new PatternItem[i];
            case 15:
                return new PinConfig[i];
            case 16:
                return new PointOfInterest[i];
            case 17:
                return new PolygonOptions[i];
            case 18:
                return new PolylineOptions[i];
            case 19:
                return new StampStyle[i];
            default:
                return new StreetViewPanoramaCamera[i];
        }
    }
}
