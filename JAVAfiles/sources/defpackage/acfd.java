package defpackage;

import android.os.Parcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.FileGroupWithDownloadStatus;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.mdd.OverrideFileGroupRequest;
import com.google.android.gms.mdh.FootprintsRecordingSetting;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import com.google.android.gms.mdh.SecondaryIdMatcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfd implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acfd(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 485
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r21) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acfd.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new StreetViewPanoramaLocation[i];
            case 1:
                return new StreetViewPanoramaLink[i];
            case 2:
                return new StreetViewPanoramaOrientation[i];
            case 3:
                return new StreetViewSource[i];
            case 4:
                return new StrokeStyle[i];
            case 5:
                return new StyleSpan[i];
            case 6:
                return new Tile[i];
            case 7:
                return new TileOverlayOptions[i];
            case 8:
                return new VisibleRegion[i];
            case 9:
                return new FileGroupRequest[i];
            case 10:
                return new FileGroupResponse[i];
            case 11:
                return new FileGroupWithDownloadStatus[i];
            case 12:
                return new MddFile[i];
            case 13:
                return new OverrideFileGroupRequest[i];
            case 14:
                return new FootprintsRecordingSetting[i];
            case 15:
                return new LatestFootprintFilter[i];
            case 16:
                return new MdhBroadcastListenerKey[i];
            case 17:
                return new MdhBroadcastListenerParams[i];
            case 18:
                return new MdhFootprint[i];
            case 19:
                return new MdhFootprintsReadResult[i];
            default:
                return new SecondaryIdMatcher[i];
        }
    }
}
