package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akdg implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ akdg(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i;
        boolean z = true;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return null;
                }
                return (gtl) alzz.aP(list);
            case 1:
                alob alobVar = new alob();
                for (gtl gtlVar : (List) obj) {
                    if (!gtlVar.c.contains("tiktok_account_work")) {
                        alobVar.h(gtlVar);
                    }
                }
                return alobVar.g();
            case 2:
                gtl gtlVar2 = (gtl) obj;
                if (gtlVar2 != null) {
                    d.s(!gtlVar2.c.contains("tiktok_account_work"));
                    return gtlVar2;
                }
                throw new NoSuchElementException("Work ID not found");
            case 3:
                return null;
            case 4:
                ((ahlp) obj).a.cancel(false);
                return null;
            case 5:
                ((akfq) obj).c();
                return null;
            case 6:
                return new akip(z);
            case 7:
                HashSet hashSet = new HashSet();
                for (ajza ajzaVar : (List) obj) {
                    if (!ajzaVar.b.i.equals("incognito")) {
                        hashSet.add(ajzaVar.a);
                    }
                }
                return hashSet;
            case 8:
                return null;
            case 9:
                return new gsw();
            case 10:
                return new gsw();
            case 11:
                return new gsv();
            case 12:
                akts aktsVar = (akts) obj;
                new SparseArray();
                return aktp.P(aktsVar.c, aktsVar.d, brg.a).f;
            case 13:
                return akrk.a;
            case 14:
                return ((alst) obj).b;
            case 15:
                String str = (String) obj;
                if (!anbk.a.h(str) || str.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str.length() + 16);
                    sb.append('\"');
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        char charAt = str.charAt(i2);
                        if (charAt != '\r' && charAt != '\\') {
                            if (charAt == '\"') {
                                charAt = '\"';
                            } else {
                                sb.append(charAt);
                            }
                        }
                        sb.append('\\');
                        sb.append(charAt);
                    }
                    sb.append('\"');
                    return sb.toString();
                }
                return str;
            case 16:
                Collection collection = (Collection) obj;
                if (collection instanceof alpl) {
                    alpl alplVar = (alpl) collection;
                    alplVar.l();
                    return alplVar;
                }
                if (collection instanceof alsj) {
                    i = ((alsj) collection).i().size();
                } else {
                    i = 11;
                }
                alpi alpiVar = new alpi(i);
                alpiVar.b(collection);
                return alpiVar.a();
            case 17:
                anek anekVar = andc.a;
                return ((andc) obj).c;
            case 18:
                return ((Throwable) obj).getMessage();
            case 19:
                Log.e("ClientLoggingBackend", "Logging to Clearcut failed.", (Exception) obj);
                return null;
            default:
                return ((MessageDigest) obj).getAlgorithm();
        }
    }
}
