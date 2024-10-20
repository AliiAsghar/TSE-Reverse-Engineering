package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeau extends arps {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public long f;
    public boolean g;
    public boolean h;
    public /* synthetic */ Object i;
    final /* synthetic */ PersephoneDownloadWorker j;
    public int k;
    public aaop l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeau(PersephoneDownloadWorker persephoneDownloadWorker, arpe arpeVar) {
        super(arpeVar);
        this.j = persephoneDownloadWorker;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
