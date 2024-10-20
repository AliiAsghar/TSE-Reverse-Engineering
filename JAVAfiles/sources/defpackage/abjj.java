package defpackage;

import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.RegisteredPackageInfo;
import com.google.android.gms.appdatasearch.RequestIndexingSpecification;
import com.google.android.gms.appdatasearch.ResultClickInfo;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.ScoringConfig;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjj implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abjj(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 548
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abjj.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new QuerySpecification[i];
            case 1:
                return new PhraseAffinitySpecification[i];
            case 2:
                return new RegisterCorpusIMEInfo[i];
            case 3:
                return new RegisterCorpusInfo[i];
            case 4:
                return new RegisterSectionInfo[i];
            case 5:
                return new RegisteredPackageInfo[i];
            case 6:
                return new RequestIndexingSpecification[i];
            case 7:
                return new ResultClickInfo[i];
            case 8:
                return new STSortSpec[i];
            case 9:
                return new ScoringConfig[i];
            case 10:
                return new Section[i];
            case 11:
                return new StorageStats[i];
            case 12:
                return new SuggestSpecification[i];
            case 13:
                return new SuggestionResults[i];
            case 14:
                return new UsageInfo[i];
            case 15:
                return new GetAsterismConsentRequest[i];
            case 16:
                return new GetAsterismConsentResponse[i];
            case 17:
                return new SetAsterismConsentResponse[i];
            case 18:
                return new AccountChangeEvent[i];
            case 19:
                return new AccountChangeEventsRequest[i];
            default:
                return new AccountChangeEventsResponse[i];
        }
    }
}
