package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jfe extends arpw implements arqw {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    final /* synthetic */ jfh c;
    final /* synthetic */ Context d;
    final /* synthetic */ jsy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfe(jfh jfhVar, Context context, jsy jsyVar, arpe arpeVar) {
        super(3, arpeVar);
        this.c = jfhVar;
        this.d = context;
        this.e = jsyVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        jfe jfeVar = new jfe(this.c, this.d, this.e, (arpe) obj3);
        jfeVar.a = booleanValue;
        jfeVar.b = booleanValue2;
        return jfeVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        if (z2) {
            return null;
        }
        String string = this.d.getString(R.string.action_show_subject_field);
        string.getClass();
        return new aehz(string, null, false, true, z, false, null, null, new ixz(this.e, 16), 998);
    }
}
