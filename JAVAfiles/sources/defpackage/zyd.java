package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyd extends arpw implements arra {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    final /* synthetic */ aair g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyd(aair aairVar, arpe arpeVar) {
        super(7, arpeVar);
        this.g = aairVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [miu, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.f;
        aron aronVar = new aron((byte[]) null);
        if (obj2 != null) {
            String h = r1.h();
            h.getClass();
            aehz aehzVar = (aehz) obj2;
            aerb aerbVar = aehzVar.b;
            aerbVar.getClass();
            aronVar.add(new zyj(new aeth(h, null, aehzVar.a, null, new aete(aerbVar), aehzVar.j, 90)));
        }
        if (obj6 != null) {
            aehz aehzVar2 = (aehz) obj6;
            aerb aerbVar2 = aehzVar2.b;
            aerbVar2.getClass();
            aronVar.add(new zyj(new aeth(aehzVar2.a, null, null, null, new aete(aerbVar2), aehzVar2.j, 94)));
        }
        aehz aehzVar3 = (aehz) obj3;
        String str = aehzVar3.a;
        aerb aerbVar3 = aehzVar3.b;
        aerbVar3.getClass();
        aronVar.add(new zyj(new aeth(str, null, null, null, new aete(aerbVar3), aehzVar3.j, 94)));
        if (obj5 != null) {
            String string = ((Context) this.g.d).getString(R.string.report_spam);
            string.getClass();
            aronVar.add(new zyj(new aeth(string, null, null, null, new aete(aerb.cz), ((aehz) obj5).j, 94), 2));
        }
        if (obj4 != null) {
            aehz aehzVar4 = (aehz) obj4;
            aerb aerbVar4 = aehzVar4.b;
            aerbVar4.getClass();
            aronVar.add(new zyj(new aeth(aehzVar4.a, null, null, null, new aete(aerbVar4), aehzVar4.j, 94), 2));
        }
        return new zyc(alzz.aZ(aqjn.x(aronVar)));
    }

    @Override // defpackage.arra
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        zyd zydVar = new zyd(this.g, (arpe) obj7);
        zydVar.a = (miu) obj;
        zydVar.b = (aehz) obj2;
        zydVar.c = (aehz) obj3;
        zydVar.d = (aehz) obj4;
        zydVar.e = (aehz) obj5;
        zydVar.f = (aehz) obj6;
        return zydVar.b(arnb.a);
    }
}
