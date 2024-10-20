package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jis extends arpw implements arqz {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    /* synthetic */ boolean e;
    final /* synthetic */ jiu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jis(jiu jiuVar, arpe arpeVar) {
        super(6, arpeVar);
        this.f = jiuVar;
    }

    @Override // defpackage.arqz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        jis jisVar = new jis(this.f, (arpe) obj6);
        jisVar.a = (jht) obj;
        jisVar.b = (mit) obj2;
        jisVar.c = (jjd) obj3;
        jisVar.d = booleanValue;
        jisVar.e = booleanValue2;
        return jisVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        String string;
        String string2;
        String string3;
        aqil.P(obj);
        jht jhtVar = (jht) this.a;
        int i = jhtVar.e;
        boolean z = jhtVar.a;
        int i2 = jhtVar.b;
        mjq mjqVar = jhtVar.c;
        long j = jhtVar.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        boolean z2 = obj3 instanceof jjc;
        boolean z3 = this.d;
        boolean z4 = this.e;
        int i3 = R.string.compose_bar_text_hint_enter_xms;
        if (z2) {
            boolean M = lgc.M(i);
            jji a = ((jjc) obj3).a();
            boolean z5 = obj3 instanceof jja;
            if (this.f.j.a() && !z5) {
                Object b = this.f.m.b();
                b.getClass();
                if (((CharSequence) b).length() > 0) {
                    jiu jiuVar = this.f;
                    Object b2 = jiuVar.m.b();
                    String string4 = jiuVar.b.getString(R.string.compose_bar_text_inspiring_hint_xms);
                    Objects.toString(b2);
                    string3 = String.valueOf(b2).concat(String.valueOf(string4));
                    return new jhx(a, M, z, i2, mjqVar, z5, string3);
                }
            }
            jiu jiuVar2 = this.f;
            if (true == z5) {
                i3 = R.string.compose_bar_text_hint_enter_mass_sms;
            }
            string3 = jiuVar2.b.getString(i3);
            string3.getClass();
            return new jhx(a, M, z, i2, mjqVar, z5, string3);
        }
        boolean z6 = false;
        if (obj3 instanceof jiz) {
            jji jjiVar = ((jiz) obj3).a;
            boolean M2 = lgc.M(i);
            String string5 = this.f.b.getString(R.string.compose_bar_text_hint_enter_satellite_with_char_limit, new Long(j));
            string5.getClass();
            return new jhw(jjiVar, M2, z, i2, mjqVar, string5);
        }
        boolean F = d.F(obj3, jiy.b);
        int i4 = R.string.compose_bar_text_hint_add_text;
        if (F) {
            boolean M3 = lgc.M(i);
            if (this.f.j.a() && !z3) {
                Object b3 = this.f.m.b();
                b3.getClass();
                if (((CharSequence) b3).length() > 0) {
                    jiu jiuVar3 = this.f;
                    Object b4 = jiuVar3.m.b();
                    String string6 = jiuVar3.b.getString(R.string.compose_bar_text_inspiring_hint_xms);
                    Objects.toString(b4);
                    string2 = String.valueOf(b4).concat(String.valueOf(string6));
                    return new jhu(M3, z, i2, mjqVar, z3, string2);
                }
            }
            jiu jiuVar4 = this.f;
            if (z3) {
                i3 = R.string.compose_bar_text_hint_add_text;
            }
            string2 = jiuVar4.b.getString(i3);
            string2.getClass();
            return new jhu(M3, z, i2, mjqVar, z3, string2);
        }
        if (d.F(obj3, jiy.a)) {
            boolean M4 = lgc.M(i);
            if (((Boolean) this.f.f.b()).booleanValue() && ((oqb) this.f.g.b()).a()) {
                z6 = true;
            }
            if (this.f.j.a()) {
                Object b5 = this.f.m.b();
                b5.getClass();
                if (((CharSequence) b5).length() > 0) {
                    jiu jiuVar5 = this.f;
                    Context context = jiuVar5.b;
                    Object b6 = jiuVar5.m.b();
                    String string7 = context.getString(R.string.compose_bar_text_inspiring_hint_rcs);
                    Objects.toString(b6);
                    string = String.valueOf(b6).concat(String.valueOf(string7));
                    return new jhv(M4, z, i2, mjqVar, z3, (mit) obj2, z4, z6, string);
                }
            }
            jiu jiuVar6 = this.f;
            if (!z3) {
                i4 = R.string.compose_bar_text_hint_enter_rcs;
            }
            string = jiuVar6.b.getString(i4);
            string.getClass();
            return new jhv(M4, z, i2, mjqVar, z3, (mit) obj2, z4, z6, string);
        }
        throw new armm();
    }
}
