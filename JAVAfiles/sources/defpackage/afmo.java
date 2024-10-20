package defpackage;

import android.support.v4.app.FragmentContainerView;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.EditText;
import com.google.android.libraries.compose.ui.composable.HugoHostFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmo extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmo(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [afqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v51, types: [afkr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, aflj] */
    /* JADX WARN: Type inference failed for: r9v0, types: [afqq, java.lang.Object, afcp] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        boolean z = true;
        Object obj2 = null;
        cg cgVar = null;
        afxy afxyVar = null;
        Object obj3 = null;
        switch (this.b) {
            case 0:
                afmf afmfVar = (afmf) obj;
                afmfVar.getClass();
                if (afmfVar.b == this.a) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                afmf afmfVar2 = (afmf) obj;
                afmfVar2.getClass();
                Object obj4 = this.a;
                if (obj4 != aflq.b) {
                    obj2 = obj4;
                }
                afmfVar2.a = (aflq) obj2;
                return arnb.a;
            case 2:
                afmf afmfVar3 = (afmf) obj;
                afmfVar3.getClass();
                Object obj5 = this.a;
                if (obj5 != aflr.b) {
                    obj3 = obj5;
                }
                afmfVar3.b = (aflr) obj3;
                return arnb.a;
            case 3:
                String str = (String) obj;
                str.getClass();
                String c = ((afni) this.a).a.c(str);
                if (c == null) {
                    return str;
                }
                return c;
            case 4:
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                afox e = ((afof) this.a).e();
                ArrayList arrayList = new ArrayList(aqjn.J(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new afor((afnb) it.next(), 0));
                }
                e.r.d(afox.n[0], arrayList);
                return arnb.a;
            case 5:
                aflw aflwVar = (aflw) obj;
                aflwVar.getClass();
                arqr arqrVar = ((afpr) this.a).f;
                if (arqrVar != null) {
                    arqrVar.a(aflwVar);
                }
                afpr afprVar = (afpr) this.a;
                afprVar.f = null;
                afprVar.dismiss();
                return arnb.a;
            case 6:
                afvf afvfVar = (afvf) obj;
                afvfVar.getClass();
                ?? a = this.a.a();
                a.getClass();
                afve b = afve.b(afvfVar.c);
                if (b == null) {
                    b = afve.UNRECOGNIZED;
                }
                b.getClass();
                afsz c2 = afwv.c(b);
                String str2 = afvfVar.d;
                str2.getClass();
                afsk afskVar = (afsk) afrt.d(str2);
                String str3 = afvfVar.e;
                str3.getClass();
                return new afqr(c2, afskVar, str3, afvfVar.g, afvfVar.h, afvfVar.i, a);
            case 7:
                afsz afszVar = (afsz) obj;
                afszVar.getClass();
                if (afszVar.compareTo((afsz) this.a) < 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                afsz afszVar2 = (afsz) obj;
                afszVar2.getClass();
                if (afszVar2 != this.a) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                dk dkVar = (dk) obj;
                dkVar.getClass();
                dkVar.k((cg) this.a);
                return arnb.a;
            case 10:
                agea ageaVar = (agea) obj;
                if (ageaVar == null) {
                    return null;
                }
                afwf afwfVar = (afwf) this.a;
                afwe afweVar = new afwe(ageaVar, afwfVar);
                afweVar.k().d(((afwk) afwfVar.i.b).e);
                return afweVar;
            case 11:
                ((Animation) obj).getClass();
                ((View) ((afwt) this.a).e.l).setVisibility(0);
                return arnb.a;
            case 12:
                ((Animation) obj).getClass();
                ((View) ((afwt) this.a).e.l).setVisibility(8);
                return arnb.a;
            case 13:
                ((bxi) obj).getClass();
                eea.c((Window) this.a, false);
                return new kbe(this.a, 10);
            case 14:
                ((rg) obj).getClass();
                ((alvg) HugoHostFragment.a.g().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment$onCreateView$1$5", "invoke", 145, "HugoHostFragment.kt")).q("Handling back navigation event.");
                afxy afxyVar2 = ((HugoHostFragment) this.a).aj;
                if (afxyVar2 == null) {
                    arro.b("hugoManager");
                    afxyVar2 = null;
                }
                if (!afxyVar2.o()) {
                    afxy afxyVar3 = ((HugoHostFragment) this.a).aj;
                    if (afxyVar3 == null) {
                        arro.b("hugoManager");
                    } else {
                        afxyVar = afxyVar3;
                    }
                    int ordinal = afxyVar.c().ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    ((alvg) HugoHostFragment.a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 248, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is CLOSED.");
                                } else {
                                    throw new armm();
                                }
                            } else {
                                ((alvg) HugoHostFragment.a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 241, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is EXPANDED.");
                            }
                        } else {
                            ((alvg) HugoHostFragment.a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 234, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is ABOVE_KEYBOARD.");
                        }
                    } else {
                        ((alvg) HugoHostFragment.a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 227, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is MATCHING_KEYBOARD.");
                    }
                }
                return arnb.a;
            case 15:
                FragmentContainerView fragmentContainerView = (FragmentContainerView) obj;
                fragmentContainerView.getClass();
                Object obj6 = this.a;
                if (obj6 != null) {
                    cgVar = ((da) obj6).d(fragmentContainerView.getId());
                }
                if (cgVar != null && !((da) this.a).ab()) {
                    bd bdVar = new bd((da) this.a);
                    bdVar.n(cgVar);
                    bdVar.i();
                }
                return arnb.a;
            case 16:
                View view = (View) obj;
                view.getClass();
                this.a.a(view);
                return arnb.a;
            case 17:
                dhv dhvVar = (dhv) obj;
                dhvVar.getClass();
                EditText editText = (EditText) ((czj) this.a).a;
                if (editText != null) {
                    editText.setText(dhvVar.b);
                }
                return true;
            case 18:
                dhv dhvVar2 = (dhv) obj;
                dhvVar2.getClass();
                EditText editText2 = (EditText) ((czj) this.a).a;
                if (editText2 != null) {
                    int selectionStart = editText2.getSelectionStart();
                    editText2.getText().replace(selectionStart, editText2.getSelectionEnd(), dhvVar2);
                    editText2.setSelection(arrn.s(selectionStart + dhvVar2.a(), editText2.length()));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                afll afllVar = (afll) obj;
                afllVar.getClass();
                afllVar.i(this.a);
                return arnb.a;
            default:
                afll afllVar2 = (afll) obj;
                afllVar2.getClass();
                afllVar2.j(this.a);
                return arnb.a;
        }
    }
}
