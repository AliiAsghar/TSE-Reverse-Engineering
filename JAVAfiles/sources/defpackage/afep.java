package defpackage;

import android.media.MediaCodec;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afep extends arps {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ afeq c;
    int d;
    MediaCodec.BufferInfo e;
    MediaCodec f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afep(afeq afeqVar, arpe arpeVar) {
        super(arpeVar);
        this.c = afeqVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
