package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ker extends arrp implements arqg {
    final /* synthetic */ keq a;
    final /* synthetic */ jat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ker(jat jatVar, keq keqVar) {
        super(0);
        this.b = jatVar;
        this.a = keqVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        aemj aemjVar;
        aemj aemjVar2;
        int i = this.a.b;
        jat jatVar = this.b;
        switch (i - 1) {
            case 0:
                String string = ((Context) jatVar.a).getString(R.string.demo_card_title);
                string.getClass();
                aemi aemiVar = new aemi(string);
                String string2 = ((Context) jatVar.a).getString(R.string.demo_card_line_1);
                string2.getClass();
                aemjVar = new aemj(aemiVar, aqjn.y(new aesr(string2, null, null, false, 62)), false, null, 28);
                break;
            case 1:
                String string3 = ((Context) jatVar.a).getString(R.string.real_card_title);
                string3.getClass();
                aemi aemiVar2 = new aemi(string3);
                String string4 = ((Context) jatVar.a).getString(R.string.real_card_line_1);
                string4.getClass();
                String string5 = ((Context) jatVar.a).getString(R.string.real_card_line_2);
                string5.getClass();
                String string6 = ((Context) jatVar.a).getString(R.string.real_card_line_3);
                string6.getClass();
                aemjVar2 = new aemj(aemiVar2, aqjn.B(new aesr(string4, aerb.aK, null, false, 60), new aesr(string5, aerb.dn, null, false, 60), new aesr(string6, aerb.bC, null, false, 60)), false, null, 28);
                aemjVar = aemjVar2;
                break;
            case 2:
                String string7 = ((Context) jatVar.a).getString(R.string.real_card_end_success_title);
                string7.getClass();
                aemi aemiVar3 = new aemi(string7);
                String string8 = ((Context) jatVar.a).getString(R.string.end_emergency_success_dont_need_help_card_line_1, jatVar.d);
                string8.getClass();
                String string9 = ((Context) jatVar.a).getString(R.string.end_emergency_success_dont_need_help_card_line_2, jatVar.d, jatVar.t((String) jatVar.b));
                string9.getClass();
                Object obj = jatVar.a;
                Object obj2 = jatVar.d;
                aerb aerbVar = aerb.M;
                String string10 = ((Context) obj).getString(R.string.end_emergency_success_dont_need_help_card_line_2, obj2, jatVar.b);
                string10.getClass();
                String string11 = ((Context) jatVar.a).getString(R.string.end_emergency_success_dont_need_help_card_line_3);
                string11.getClass();
                aemjVar2 = new aemj(aemiVar3, aqjn.B(new aesr(string8, aerb.aK, null, false, 60), new aesr(string9, aerbVar, jatVar.u(string10), false, 52), new aesr(string11, aerb.cY, null, false, 60)), false, null, 28);
                aemjVar = aemjVar2;
                break;
            case 3:
                String string12 = ((Context) jatVar.a).getString(R.string.real_card_end_success_title);
                string12.getClass();
                aemi aemiVar4 = new aemi(string12);
                String string13 = ((Context) jatVar.a).getString(R.string.end_emergency_success_still_need_help_card_line_1);
                string13.getClass();
                String string14 = ((Context) jatVar.a).getString(R.string.end_emergency_success_still_need_help_card_line_2, jatVar.d, jatVar.t((String) jatVar.b));
                string14.getClass();
                Object obj3 = jatVar.a;
                Object obj4 = jatVar.d;
                aerb aerbVar2 = aerb.M;
                String string15 = ((Context) obj3).getString(R.string.end_emergency_success_still_need_help_card_line_2, obj4, jatVar.b);
                string15.getClass();
                String string16 = ((Context) jatVar.a).getString(R.string.end_emergency_success_still_need_help_card_line_3);
                string16.getClass();
                aemjVar2 = new aemj(aemiVar4, aqjn.B(new aesr(string13, aerb.aK, null, false, 60), new aesr(string14, aerbVar2, jatVar.u(string15), false, 52), new aesr(string16, aerb.m, null, false, 60)), false, null, 28);
                aemjVar = aemjVar2;
                break;
            case 4:
                String string17 = ((Context) jatVar.a).getString(R.string.real_card_end_failure_title);
                string17.getClass();
                aemi aemiVar5 = new aemi(string17);
                String string18 = ((Context) jatVar.a).getString(R.string.end_emergency_failure_dont_need_help_card_line_1, jatVar.d, jatVar.t((String) jatVar.b));
                string18.getClass();
                Object obj5 = jatVar.a;
                Object obj6 = jatVar.d;
                aerb aerbVar3 = aerb.dP;
                String string19 = ((Context) obj5).getString(R.string.end_emergency_failure_dont_need_help_card_line_1, obj6, jatVar.b);
                string19.getClass();
                String string20 = ((Context) jatVar.a).getString(R.string.end_emergency_failure_dont_need_help_card_line_2, jatVar.d);
                string20.getClass();
                String string21 = ((Context) jatVar.a).getString(R.string.end_emergency_failure_dont_need_help_card_line_3);
                string21.getClass();
                aemjVar = new aemj(aemiVar5, aqjn.B(new aesr(string18, aerbVar3, jatVar.u(string19), true, 36), new aesr(string20, aerb.U, null, true, 44), new aesr(string21, aerb.m, null, true, 44)), true, null, 24);
                break;
            case 5:
                String string22 = ((Context) jatVar.a).getString(R.string.real_card_end_failure_title);
                string22.getClass();
                aemi aemiVar6 = new aemi(string22);
                String string23 = ((Context) jatVar.a).getString(R.string.end_emergency_failure_still_need_help_card_line_1);
                string23.getClass();
                String string24 = ((Context) jatVar.a).getString(R.string.end_emergency_failure_still_need_help_card_line_2, jatVar.d, jatVar.t((String) jatVar.b));
                string24.getClass();
                Object obj7 = jatVar.a;
                Object obj8 = jatVar.d;
                aerb aerbVar4 = aerb.M;
                String string25 = ((Context) obj7).getString(R.string.end_emergency_failure_still_need_help_card_line_2, obj8, jatVar.b);
                string25.getClass();
                String string26 = ((Context) jatVar.a).getString(R.string.end_emergency_failure_still_need_help_card_line_3);
                string26.getClass();
                aemjVar = new aemj(aemiVar6, aqjn.B(new aesr(string23, aerb.aK, null, true, 44), new aesr(string24, aerbVar4, jatVar.u(string25), true, 36), new aesr(string26, aerb.m, null, true, 44)), true, null, 24);
                break;
            case 6:
                String string27 = ((Context) jatVar.a).getString(R.string.real_card_end_unexpectedly_title);
                string27.getClass();
                aemi aemiVar7 = new aemi(string27);
                String string28 = ((Context) jatVar.a).getString(R.string.end_emergency_unexpected_card_line_1);
                string28.getClass();
                String string29 = ((Context) jatVar.a).getString(R.string.end_emergency_unexpected_card_line_2, jatVar.d, jatVar.t((String) jatVar.b));
                string29.getClass();
                Object obj9 = jatVar.a;
                Object obj10 = jatVar.d;
                aerb aerbVar5 = aerb.M;
                String string30 = ((Context) obj9).getString(R.string.end_emergency_unexpected_card_line_2, obj10, jatVar.b);
                string30.getClass();
                String string31 = ((Context) jatVar.a).getString(R.string.end_emergency_unexpected_card_line_3);
                string31.getClass();
                aemjVar = new aemj(aemiVar7, aqjn.B(new aesr(string28, aerb.aK, null, true, 44), new aesr(string29, aerbVar5, jatVar.u(string30), true, 36), new aesr(string31, aerb.m, null, true, 44)), true, null, 24);
                break;
            default:
                String string32 = ((Context) jatVar.a).getString(R.string.satellite_emergency_card_line_1);
                string32.getClass();
                String string33 = ((Context) jatVar.a).getString(R.string.satellite_emergency_card_line_2);
                string33.getClass();
                List B = aqjn.B(new aesr(string32, aerb.m, null, false, 60), new aesr(string33, aerb.dn, null, false, 60));
                String string34 = ((Context) jatVar.a).getString(R.string.more_about_satellite_button);
                string34.getClass();
                aemjVar2 = new aemj(null, B, false, new aemg(string34, new jwl(jatVar.c, 4, (float[]) null)), 12);
                aemjVar = aemjVar2;
                break;
        }
        return new kes(aemjVar, this.a.a);
    }
}
