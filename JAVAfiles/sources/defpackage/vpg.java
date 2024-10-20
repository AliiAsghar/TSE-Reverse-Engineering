package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vpg extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ vpk b;
    int c;
    vpk d;
    SelfIdentityIdImpl e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpg(vpk vpkVar, arpe arpeVar) {
        super(arpeVar);
        this.b = vpkVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object g = this.b.g(null, 0, this);
        if (g == arpl.a) {
            return g;
        }
        return new armq(g);
    }
}
