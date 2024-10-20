package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ucg {
    public uch a;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    final /* synthetic */ uci c;

    public ucg(uci uciVar) {
        this.c = uciVar;
    }

    public final void a(agni agniVar, boolean z) {
        this.b.offer(new ucc(agniVar, Thread.currentThread().getId(), this.c.e.f().toEpochMilli(), z));
        while (this.b.size() > 50) {
            this.b.poll();
        }
    }
}
