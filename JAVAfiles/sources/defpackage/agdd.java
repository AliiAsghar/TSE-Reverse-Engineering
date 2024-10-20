package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdd extends arpw implements arqv {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ agde d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdd(agde agdeVar, arpe arpeVar) {
        super(2, arpeVar);
        this.d = agdeVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((agdd) c(bool, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        ExoPlayer exoPlayer;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            z = this.c;
            Object obj2 = this.a;
            aqil.P(obj);
            exoPlayer = obj2;
        } else {
            aqil.P(obj);
            z = this.c;
            exoPlayer = this.d.i;
        }
        while (z && exoPlayer != null) {
            agde agdeVar = this.d;
            agdeVar.f.f(new Long(exoPlayer.z()));
            this.a = exoPlayer;
            this.c = true;
            this.b = 1;
            if (arwi.m(100L, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        agdd agddVar = new agdd(this.d, arpeVar);
        agddVar.c = ((Boolean) obj).booleanValue();
        return agddVar;
    }
}
