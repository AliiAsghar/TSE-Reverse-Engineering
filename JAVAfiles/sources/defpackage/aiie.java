package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiie {
    public static final /* synthetic */ int a = 0;
    private static final alor b;
    private static final alnr c;
    private static final alor d;
    private static final alor e;
    private static final alnr f;

    static {
        alok alokVar = new alok();
        alokVar.h(atmb.class, 35);
        alokVar.h(atng.class, 33);
        alokVar.h(atka.class, 1);
        alokVar.h(atjw.class, 28);
        b = alokVar.b();
        alnp alnpVar = new alnp();
        alnpVar.c(atmb.class, apiq.DNS_QUERY_TYPE_NAPTR);
        alnpVar.c(atng.class, apiq.DNS_QUERY_TYPE_SRV);
        alnpVar.c(atka.class, apiq.DNS_QUERY_TYPE_A);
        alnpVar.c(atjw.class, apiq.DNS_QUERY_TYPE_AAAA);
        c = alnpVar.b();
        alok alokVar2 = new alok();
        alokVar2.h(0, apip.DNS_QUERY_RESULT_SUCCESS);
        alokVar2.h(3, apip.DNS_QUERY_RESULT_FAILURE);
        alokVar2.h(4, apip.DNS_QUERY_RESULT_FAILURE);
        alokVar2.h(2, apip.DNS_QUERY_RESULT_FAILURE);
        alokVar2.h(1, apip.DNS_QUERY_RESULT_FAILURE);
        d = alokVar2.b();
        alok alokVar3 = new alok();
        alokVar3.h(3, apio.DNS_FAILURE_TYPE_HOST_NOT_FOUND);
        alokVar3.h(4, apio.DNS_FAILURE_TYPE_QUERY_TYPE_NOT_FOUND);
        alokVar3.h(2, apio.DNS_FAILURE_TYPE_TRANSIENT);
        alokVar3.h(1, apio.DNS_FAILURE_TYPE_GENERIC);
        e = alokVar3.b();
        alnp alnpVar2 = new alnp();
        alnpVar2.c(ClassCastException.class, apin.DNS_CLIENT_EXCEPTION_TYPE_CLASS_CAST);
        alnpVar2.c(atns.class, apin.DNS_CLIENT_EXCEPTION_TYPE_TEXT_PARSE);
        alnpVar2.c(ExceptionInInitializerError.class, apin.DNS_CLIENT_EXCEPTION_TYPE_EXCEPTION_IN_INITIALIZATION_ERROR);
        alnpVar2.c(NoClassDefFoundError.class, apin.DNS_CLIENT_EXCEPTION_TYPE_NO_CLASS_DEF_FOUND_ERROR);
        alnpVar2.c(RuntimeException.class, apin.DNS_CLIENT_EXCEPTION_TYPE_RUNTIME);
        f = alnpVar2.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Class cls) {
        Integer num = (Integer) b.get(cls);
        cls.getName();
        num.getClass();
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aihy b(String str, Class cls, String[] strArr) {
        String str2;
        long e2 = e();
        if (strArr.length == 0) {
            str2 = null;
        } else {
            str2 = strArr[0];
        }
        String str3 = str2;
        str.getClass();
        return new aihy(str, (apiq) c.getOrDefault(cls, apiq.DNS_QUERY_TYPE_UNKNOWN), str3, e2, false);
    }

    public static aihz c(aihy aihyVar, Throwable th) {
        return new aihz(aihyVar, apip.DNS_QUERY_RESULT_FAILURE, aihz.a, Optional.of(apio.DNS_FAILURE_TYPE_CLIENT_EXCEPTION), Optional.of((apin) f.getOrDefault(th.getClass(), apin.DNS_CLIENT_EXCEPTION_TYPE_UNKNOWN)), e());
    }

    public static aihz d(atal atalVar, aihy aihyVar, List list) {
        List list2;
        apio apioVar = null;
        if (list != null && !list.isEmpty()) {
            list2 = (List) Collection.EL.stream(list).map(new aiec(11)).collect(Collectors.toList());
        } else {
            list2 = null;
        }
        long e2 = e();
        apip apipVar = (apip) d.getOrDefault(Integer.valueOf(atalVar.h()), apip.DNS_QUERY_RESULT_UNKNOWN);
        if (atalVar.h() != 0) {
            apioVar = (apio) e.getOrDefault(Integer.valueOf(atalVar.h()), apio.DNS_FAILURE_TYPE_UNKNOWN);
        }
        alog alogVar = aihz.a;
        boolean z = true;
        if (apip.DNS_QUERY_RESULT_SUCCESS.equals(apipVar)) {
            if (apioVar != null) {
                z = false;
            }
            d.t(z, "expected null failure type on success");
        } else if (apip.DNS_QUERY_RESULT_FAILURE.equals(apipVar)) {
            if (apioVar == null) {
                z = false;
            }
            d.t(z, "expected failure type");
        }
        if (list2 == null) {
            list2 = aihz.a;
        }
        return new aihz(aihyVar, apipVar, list2, Optional.ofNullable(apioVar), Optional.empty(), e2);
    }

    private static long e() {
        return System.nanoTime() / 1000000;
    }
}
