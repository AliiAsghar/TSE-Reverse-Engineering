package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jtn extends arpw implements arqy {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ jto e;
    final /* synthetic */ oxa f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtn(jto jtoVar, oxa oxaVar, arpe arpeVar) {
        super(5, arpeVar);
        this.e = jtoVar;
        this.f = oxaVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aeor aeorVar;
        aeor aeorVar2;
        aqil.P(obj);
        ?? r2 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        jto jtoVar = this.e;
        if (obj3 != null) {
            jji jjiVar = (jji) obj3;
            if (jjiVar.b == 1) {
                String string = jtoVar.b.getString(R.string.single_message_counter, new Integer(jjiVar.a));
                string.getClass();
                aeorVar2 = new aeor(string, jjiVar.c);
            } else {
                String string2 = jtoVar.b.getString(R.string.multiple_messages_counter, new Integer(jjiVar.a), new Integer(jjiVar.b));
                string2.getClass();
                aeorVar2 = new aeor(string2, jjiVar.c);
            }
            aeorVar = aeorVar2;
        } else {
            aeorVar = null;
        }
        afzk afzkVar = jtoVar.k;
        jto jtoVar2 = this.e;
        return new aeno(afzkVar, (CharSequence) r2, (String) obj2, (Integer) obj4, true, aeorVar, new aenn(jtoVar2.f.a(), jtoVar2.g.a(), this.f.a()));
    }

    @Override // defpackage.arqy
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        jtn jtnVar = new jtn(this.e, this.f, (arpe) obj5);
        jtnVar.a = (String) obj;
        jtnVar.b = (String) obj2;
        jtnVar.c = (jji) obj3;
        jtnVar.d = (Integer) obj4;
        return jtnVar.b(arnb.a);
    }
}
