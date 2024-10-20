package defpackage;

import android.view.Menu;
import android.view.SubMenu;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysItemView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aakk implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aakk(aajm aajmVar, DebugGServiceKeysItemView debugGServiceKeysItemView, String str, int i) {
        this.d = i;
        this.b = aajmVar;
        this.a = debugGServiceKeysItemView;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, aals] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.Menu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.Menu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.Menu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.Menu, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        boolean z;
        switch (this.d) {
            case 0:
                final SuperSortLabel superSortLabel = (SuperSortLabel) obj;
                String name = superSortLabel.name();
                final aalt aaltVar = (aalt) this.a;
                aaltVar.k(this.b, name, new aalq() { // from class: aakx
                    @Override // defpackage.aalq
                    public final void a(zof zofVar) {
                        if (!((Optional) zofVar.a).isEmpty()) {
                            aalt aaltVar2 = aalt.this;
                            if (!((Optional) ((apxx) aaltVar2.aq).a).isEmpty()) {
                                SuperSortLabel superSortLabel2 = superSortLabel;
                                Object obj2 = ((Optional) zofVar.a).get();
                                qiu.h(aktp.ai(new ytr(obj2, 16), aaltVar2.ai).i(new yui(aaltVar2, superSortLabel2, 10, null), aaltVar2.ai).h(new yxu(aaltVar2, obj2, superSortLabel2, 2), andi.a));
                            }
                        }
                    }
                }, (Optional) this.c);
                return;
            case 1:
                String str = (String) obj;
                aajm aajmVar = (aajm) this.b;
                boolean e = aajmVar.e.e(str);
                boolean booleanValue = ((Boolean) aajmVar.e.c(str).orElse(Boolean.valueOf(e))).booleanValue();
                String valueOf = String.valueOf(booleanValue);
                if (booleanValue != e) {
                    z = true;
                } else {
                    z = false;
                }
                ((DebugGServiceKeysItemView) this.a).a((String) this.c, "bool", valueOf, z, aajmVar);
                return;
            case 2:
                aakp aakpVar = new aakp((lqe) obj, 12);
                Object obj2 = this.c;
                ((aalt) this.a).k(this.b, "Reset OTP auto-delete states", aakpVar, (Optional) obj2);
                return;
            case 3:
                SubMenu addSubMenu = this.b.addSubMenu("Spam");
                Object obj3 = this.a;
                aakp aakpVar2 = new aakp(obj3, 9);
                Optional optional = (Optional) this.c;
                aalt aaltVar2 = (aalt) obj3;
                aaltVar2.k(addSubMenu, "Manage phone numbers with rcs spam warning...", aakpVar2, optional);
                aaltVar2.k(addSubMenu, "Mark as detected spam", new aakp((ify) obj, 10), optional);
                return;
            case 4:
                aakp aakpVar3 = new aakp((yxd) obj, 11);
                Object obj4 = this.c;
                ((aalt) this.a).k(this.b, "Reset Welcome Flow V1 state", aakpVar3, (Optional) obj4);
                return;
            case 5:
                ?? r0 = this.b;
                Object obj5 = this.c;
                ((aalt) this.a).u((ykb) obj, (String) obj5, r0);
                return;
            case 6:
                Object obj6 = this.a;
                Object obj7 = this.c;
                ((adkn) this.b).b.s((String) obj7, (apjo) obj6, (wgi) obj);
                return;
            default:
                int i = ((wxb) this.b).d;
                ((adms) this.c).e.m(this.a, (adit) obj, i);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.d) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ aakk(aalt aaltVar, Menu menu, Optional optional, int i) {
        this.d = i;
        this.a = aaltVar;
        this.b = menu;
        this.c = optional;
    }

    public /* synthetic */ aakk(aalt aaltVar, String str, aals aalsVar, int i) {
        this.d = i;
        this.a = aaltVar;
        this.c = str;
        this.b = aalsVar;
    }

    public /* synthetic */ aakk(adkn adknVar, String str, apjo apjoVar, int i) {
        this.d = i;
        this.b = adknVar;
        this.c = str;
        this.a = apjoVar;
    }

    public /* synthetic */ aakk(adms admsVar, adiv adivVar, wxb wxbVar, int i) {
        this.d = i;
        this.c = admsVar;
        this.a = adivVar;
        this.b = wxbVar;
    }
}
