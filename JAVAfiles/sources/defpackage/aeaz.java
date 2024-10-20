package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneSchedulerWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeaz extends arps {
    public /* synthetic */ Object a;
    final /* synthetic */ PersephoneSchedulerWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeaz(PersephoneSchedulerWorker persephoneSchedulerWorker, arpe arpeVar) {
        super(arpeVar);
        this.b = persephoneSchedulerWorker;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
