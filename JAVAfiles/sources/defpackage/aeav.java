package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeav extends arps {
    public /* synthetic */ Object a;
    final /* synthetic */ PersephoneDownloadWorker b;
    public int c;
    public PersephoneDownloadWorker d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeav(PersephoneDownloadWorker persephoneDownloadWorker, arpe arpeVar) {
        super(arpeVar);
        this.b = persephoneDownloadWorker;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, this);
    }
}
