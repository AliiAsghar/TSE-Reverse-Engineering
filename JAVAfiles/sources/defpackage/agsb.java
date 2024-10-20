package defpackage;

import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agsb implements agsd {
    final /* synthetic */ agsc a;

    public agsb(agsc agscVar) {
        this.a = agscVar;
    }

    @Override // defpackage.agsd
    public final void a(int i) {
        agsc agscVar = this.a;
        agscVar.d = Integer.toString(i);
        agscVar.e = i;
        agscVar.ag.b();
        agsc agscVar2 = this.a;
        if (agscVar2.a.g) {
            ((SurveyPromptActivity) agscVar2.fe()).z();
        } else {
            ((SurveyPromptActivity) agscVar2.fe()).A(agscVar2.r(), agscVar2);
        }
    }
}
