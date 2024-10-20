package defpackage;

import android.os.Parcelable;
import com.google.android.apps.messaging.wearable.action.SyncDataToWearableAppAction;
import com.google.android.gms.appdatasearch.CacheSpec;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdate;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abjg(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 517
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abjg.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CacheSpec[i];
            case 1:
                return new SyncDataToWearableAppAction[i];
            case 2:
                return new CorpusId[i];
            case 3:
                return new CorpusScoringInfo[i];
            case 4:
                return new CorpusStatus[i];
            case 5:
                return new DocumentContents[i];
            case 6:
                return new DocumentId[i];
            case 7:
                return new DocumentResults[i];
            case 8:
                return new DocumentSection[i];
            case 9:
                return new Feature[i];
            case 10:
                return new GetRecentContextCall$Request[i];
            case 11:
                return new GetRecentContextCall$Response[i];
            case 12:
                return new GlobalSearchAppCorpusFeatures[i];
            case 13:
                return new GlobalSearchApplication[i];
            case 14:
                return new GlobalSearchApplicationInfo[i];
            case 15:
                return new GlobalSearchCorpusConfig[i];
            case 16:
                return new NativeApiInfo[i];
            case 17:
                return new PIMEUpdate[i];
            case 18:
                return new PIMEUpdateResponse[i];
            case 19:
                return new PhraseAffinityCorpusSpec[i];
            default:
                return new PhraseAffinityResponse[i];
        }
    }
}
