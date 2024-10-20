package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeat extends arps {
    public Object a;
    public /* synthetic */ Object b;
    final /* synthetic */ PersephoneDownloadWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeat(PersephoneDownloadWorker persephoneDownloadWorker, arpe arpeVar) {
        super(arpeVar);
        this.c = persephoneDownloadWorker;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, this);
    }
}
