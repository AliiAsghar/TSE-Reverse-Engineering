package defpackage;

import android.os.Parcelable;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Request;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ache implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ache(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 451
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ache.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new RequestAppIndexingUpdateIndexCall$Request[i];
            case 1:
                return new GetStorageStatsCall$Response[i];
            case 2:
                return new RequestAppIndexingUpdateIndexCall$Response[i];
            case 3:
                return new ClearCorpusCall$Request[i];
            case 4:
                return new ClearCorpusCall$Response[i];
            case 5:
                return new DeleteUsageReportCall$Request[i];
            case 6:
                return new DeleteUsageReportCall$Response[i];
            case 7:
                return new GetCorpusInfoCall$Request[i];
            case 8:
                return new GetCorpusInfoCall$Response[i];
            case 9:
                return new GetCorpusStatusCall$Request[i];
            case 10:
                return new GetCorpusStatusCall$Response[i];
            case 11:
                return new RegisterCorpusInfoCall$Request[i];
            case 12:
                return new RegisterCorpusInfoCall$Response[i];
            case 13:
                return new RequestIndexingCall$Request[i];
            case 14:
                return new RequestIndexingCall$Response[i];
            case 15:
                return new GetCurrentExperimentIdsCall$Request[i];
            case 16:
                return new GetCurrentExperimentIdsCall$Response[i];
            case 17:
                return new GetGlobalSearchSourcesCall$CorpusInfo[i];
            case 18:
                return new GetGlobalSearchSourcesCall$GlobalSearchSource[i];
            case 19:
                return new GetGlobalSearchSourcesCall$Request[i];
            default:
                return new GetGlobalSearchSourcesCall$Response[i];
        }
    }
}
