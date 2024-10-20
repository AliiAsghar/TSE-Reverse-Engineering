package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akby extends arpw implements arqv {
    int a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ahiy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akby(ahiy ahiyVar, Uri uri, arpe arpeVar) {
        super(2, arpeVar);
        this.c = ahiyVar;
        this.b = uri;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akby) c((arzu) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            arzu arzuVar = (arzu) this.d;
            akbz akbzVar = new akbz(new ahhd(arzuVar, 2));
            ahiy ahiyVar = this.c;
            ((ContentResolver) ahiyVar.c).registerContentObserver(this.b, true, akbzVar);
            if (arzn.c(arzuVar.c(arnb.a))) {
                afzu afzuVar = new afzu(this.c, akbzVar, 9);
                this.a = 1;
                if (arhi.p(arzuVar, afzuVar, this) == arplVar) {
                    return arplVar;
                }
            } else {
                throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        akby akbyVar = new akby(this.c, this.b, arpeVar);
        akbyVar.d = obj;
        return akbyVar;
    }
}
