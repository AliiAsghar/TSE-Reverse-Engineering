package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.ui.rcs.setup.manual.CountryCodePickerActivity;
import com.google.android.libraries.surveys.internal.view.EmbeddedSurveyFragment;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajat implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajat(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [armf, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aprg aprgVar;
        int i;
        switch (this.c) {
            case 0:
                ajax.b((ViewGroup) this.b);
                new Handler().postDelayed(new ahsa(this.a, 17), 250L);
                return;
            case 1:
                ajap ajapVar = (ajap) this.b;
                aiyz a = ajapVar.a();
                int i2 = 0;
                if (a != null) {
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    while (true) {
                        boolean[] zArr = (boolean[]) ajapVar.o.a;
                        if (i3 < zArr.length) {
                            if (zArr[i3]) {
                                arrayList.add(Integer.valueOf(i3));
                            }
                            i3++;
                        } else {
                            asqc asqcVar = ahnz.a;
                            alog.n(arrayList);
                            asqc.z(asqcVar, a);
                        }
                    }
                }
                Object obj = this.a;
                agrk agrkVar = ajapVar.o;
                aozy createBuilder = apqz.a.createBuilder();
                if (ajapVar.g.c()) {
                    aozy createBuilder2 = apqu.a.createBuilder();
                    apro aproVar = (apro) obj;
                    if (aproVar.c == 5) {
                        aprgVar = (aprg) aproVar.d;
                    } else {
                        aprgVar = aprg.a;
                    }
                    apqh apqhVar = aprgVar.c;
                    if (apqhVar == null) {
                        apqhVar = apqh.a;
                    }
                    apax apaxVar = apqhVar.b;
                    while (true) {
                        boolean[] zArr2 = (boolean[]) agrkVar.a;
                        if (i2 < zArr2.length) {
                            if (zArr2[i2]) {
                                Object obj2 = ((apqg) apaxVar.get(i2)).e;
                                int Z = a.Z(((apqg) apaxVar.get(i2)).c);
                                if (Z != 0 && Z == 4 && !TextUtils.isEmpty(agrkVar.b)) {
                                    obj2 = agrkVar.b;
                                }
                                aozy createBuilder3 = apqx.a.createBuilder();
                                int i4 = ((apqg) apaxVar.get(i2)).d;
                                if (!createBuilder3.b.isMutable()) {
                                    createBuilder3.u();
                                }
                                apag apagVar = createBuilder3.b;
                                ((apqx) apagVar).c = i4;
                                if (!apagVar.isMutable()) {
                                    createBuilder3.u();
                                }
                                apqx apqxVar = (apqx) createBuilder3.b;
                                obj2.getClass();
                                apqxVar.d = (String) obj2;
                                int Z2 = a.Z(((apqg) apaxVar.get(i2)).c);
                                if (Z2 == 0) {
                                    Z2 = 1;
                                }
                                int i5 = Z2 - 2;
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            i = 2;
                                        } else {
                                            i = 5;
                                        }
                                    } else {
                                        i = 4;
                                    }
                                } else {
                                    i = 3;
                                }
                                if (!createBuilder3.b.isMutable()) {
                                    createBuilder3.u();
                                }
                                ((apqx) createBuilder3.b).b = a.ak(i);
                                createBuilder2.bC((apqx) createBuilder3.s());
                                ajapVar.g.a();
                            }
                            int i6 = aproVar.e;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            ((apqz) createBuilder.b).d = i6;
                            apqu apquVar = (apqu) createBuilder2.s();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            apqz apqzVar = (apqz) createBuilder.b;
                            apquVar.getClass();
                            apqzVar.c = apquVar;
                            apqzVar.b = 3;
                            i2++;
                        }
                    }
                }
                apqz apqzVar2 = (apqz) createBuilder.s();
                if (apqzVar2 != null) {
                    ajapVar.c.a = apqzVar2;
                }
                ajapVar.b((apro) obj);
                ajapVar.c();
                return;
            case 2:
                ajax.b((ViewGroup) this.b);
                new Handler().postDelayed(new ahsa(this.a, 18), 250L);
                return;
            case 3:
                asgf asgfVar = new asgf();
                ajbl ajblVar = (ajbl) this.b;
                ajblVar.o(6);
                aizr.g(ajblVar.i);
                ajblVar.u.finish();
                ahnz.K(asgfVar, ajblVar.u, (String) this.a);
                return;
            case 4:
                asgf asgfVar2 = new asgf();
                ajbl ajblVar2 = (ajbl) this.b;
                ajblVar2.f();
                ahnz.L(asgfVar2, ajblVar2.u, (String) this.a);
                return;
            case 5:
                asgf asgfVar3 = new asgf();
                aiyv aiyvVar = (aiyv) this.b;
                aiyvVar.m(6);
                aizr.g(aiyvVar.i);
                for (EmbeddedSurveyFragment embeddedSurveyFragment : aiyvVar.c()) {
                }
                ahnz.K(asgfVar3, aiyvVar.a(), (String) this.a);
                return;
            case 6:
                asgf asgfVar4 = new asgf();
                aiyv aiyvVar2 = (aiyv) this.b;
                aiyvVar2.g();
                ahnz.L(asgfVar4, aiyvVar2.a(), (String) this.a);
                return;
            case 7:
                aazm aazmVar = ((ajca) ((ajby) this.b).d.a).ah;
                Object obj3 = aazmVar.e;
                Object obj4 = this.a;
                if (obj3 != null && !((ajcb) obj3).c.equals(((ajcb) obj4).c)) {
                    ((mho) aazmVar.b.b()).S(amlw.RCS_PROVISIONING_MANUAL_MSISDN_COUNTRY_CHANGED, amlx.PROVISIONING_UI_TYPE_MANUAL_MSISDN_ENTRY);
                }
                Intent intent = new Intent();
                intent.putExtra("com.google.android.apps.messaging.ui.rcs.setup.manual.extra.COUNTRY_CODE_SELECTED", ((aoyj) obj4).toByteArray());
                ((CountryCodePickerActivity) aazmVar.a).setResult(-1, intent);
                ((CountryCodePickerActivity) aazmVar.a).finish();
                return;
            default:
                this.b.onClick(view);
                ((BaseTransientBottomBar) this.a).f(1);
                return;
        }
    }

    public /* synthetic */ ajat(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
