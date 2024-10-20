package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aamz extends arps {
    public /* synthetic */ Object a;
    final /* synthetic */ LoadMessagesReceiver b;
    public int c;
    public LoadMessagesReceiver d;
    public String e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamz(LoadMessagesReceiver loadMessagesReceiver, arpe arpeVar) {
        super(arpeVar);
        this.b = loadMessagesReceiver;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, null, this);
    }
}
