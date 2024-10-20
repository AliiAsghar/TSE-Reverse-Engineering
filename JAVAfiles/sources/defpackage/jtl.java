package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jtl extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ jto e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtl(jto jtoVar, String str, arpe arpeVar) {
        super(2, arpeVar);
        this.e = jtoVar;
        this.f = str;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jtl) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        String str;
        String str2;
        String str3;
        Object obj2;
        alvj alvjVar;
        arpl arplVar = arpl.a;
        alvj alvjVar2 = null;
        if (this.d != 0) {
            Object obj3 = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            aqil.P(obj);
            str2 = obj3;
            obj2 = obj4;
            str3 = obj5;
        } else {
            aqil.P(obj);
            if (!this.e.j) {
                if (this.f.length() == 0) {
                    alvw e = jto.a.e();
                    e.X(alwp.a, "BugleComposeRow2");
                    ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$textChangeListener$1$onTextChanged$1", "invokeSuspend", 138, "DraftTextUiAdapterImpl.kt")).q("Draft text field is empty");
                } else {
                    alvw e2 = jto.a.e();
                    e2.X(alwp.a, "BugleComposeRow2");
                    alvg alvgVar = (alvg) e2;
                    alvgVar.V(5, TimeUnit.SECONDS);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$textChangeListener$1$onTextChanged$1", "invokeSuspend", 143, "DraftTextUiAdapterImpl.kt")).t("Draft text field changed to %s", yyb.bd(this.f));
                }
            }
            String str4 = this.f;
            if (str4.length() == 0) {
                str = null;
            } else {
                str = str4;
            }
            arrx arrxVar = new arrx();
            String str5 = this.e.o.c(new jpi(str, arrxVar, 4, null)).a;
            if (arrxVar.a) {
                jto jtoVar = this.e;
                Integer num = new Integer(jtoVar.h.get());
                this.a = str;
                this.b = arrxVar;
                this.c = str5;
                this.d = 1;
                if (jtoVar.i.fv(num, this) == arplVar) {
                    return arplVar;
                }
            }
            str2 = str5;
            obj2 = arrxVar;
            str3 = str;
        }
        if (this.e.j) {
            if (str3 != null && str2 != null) {
                arrx arrxVar2 = (arrx) obj2;
                if (arrxVar2.a) {
                    alvw e3 = jto.a.e();
                    e3.X(alwp.a, "BugleComposeRow2");
                    alvg alvgVar2 = (alvg) ((alvg) e3).f(String.valueOf(arrxVar2.a));
                    alvgVar2.V(5, TimeUnit.SECONDS);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$textChangeListener$1$onTextChanged$1", "invokeSuspend", 180, "DraftTextUiAdapterImpl.kt")).H("Draft text field onTextChanged, updated %b, incoming %s, ", arrxVar2.a, yyb.bd(this.f));
                }
            } else {
                alvw g = jto.a.g();
                g.X(alwp.a, "BugleComposeRow2");
                alvg alvgVar3 = (alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$textChangeListener$1$onTextChanged$1", "invokeSuspend", 169, "DraftTextUiAdapterImpl.kt");
                Boolean valueOf = Boolean.valueOf(((arrx) obj2).a);
                if (str2 != null) {
                    alvjVar = yyb.bd(str2);
                } else {
                    alvjVar = null;
                }
                if (str3 != null) {
                    alvjVar2 = yyb.bd(str3);
                }
                alvgVar3.J("Draft text field onTextChanged, updated %b, with old and/or incoming empty: %s, %s", valueOf, alvjVar, alvjVar2);
            }
        }
        if (((Boolean) yig.ae.e()).booleanValue() && this.e.d.isPresent() && ((jcb) this.e.d.get()).d()) {
            ((jcb) this.e.d.get()).f();
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new jtl(this.e, this.f, arpeVar);
    }
}
