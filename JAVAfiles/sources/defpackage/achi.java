package defpackage;

import android.os.Parcelable;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Request;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Request;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Response;
import com.google.android.gms.search.ime.GetIMEUpdatesCall$Request;
import com.google.android.gms.search.ime.GetIMEUpdatesCall$Response;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Request;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Response;
import com.google.android.gms.search.queries.AnnotateCall$Request;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.Annotation;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achi implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public achi(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 440
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achi.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GetPendingExperimentIdsCall$Response[i];
            case 1:
                return new GetPendingExperimentIdsCall$Request[i];
            case 2:
                return new SetExperimentIdsCall$Request[i];
            case 3:
                return new SetExperimentIdsCall$Response[i];
            case 4:
                return new SetIncludeInGlobalSearchCall$Request[i];
            case 5:
                return new SetIncludeInGlobalSearchCall$Response[i];
            case 6:
                return new GetCorpusHandlesRegisteredForIMECall$Request[i];
            case 7:
                return new GetCorpusHandlesRegisteredForIMECall$Response[i];
            case 8:
                return new GetIMEUpdatesCall$Request[i];
            case 9:
                return new GetIMEUpdatesCall$Response[i];
            case 10:
                return new GetNativeApiInfoCall$Response[i];
            case 11:
                return new GetNativeApiInfoCall$Request[i];
            case 12:
                return new AnnotateCall$Request[i];
            case 13:
                return new AnnotateCall$Response[i];
            case 14:
                return new Annotation[i];
            case 15:
                return new GetDocumentsCall$Request[i];
            case 16:
                return new GetDocumentsCall$Response[i];
            case 17:
                return new GetPhraseAffinityCall$Request[i];
            case 18:
                return new GetPhraseAffinityCall$Response[i];
            case 19:
                return new GlobalQueryCall$Request[i];
            default:
                return new GlobalQueryCall$Response[i];
        }
    }
}
