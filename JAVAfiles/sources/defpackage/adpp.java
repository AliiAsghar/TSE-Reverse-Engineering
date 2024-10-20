package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.function.Supplier;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adpp implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adpp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                return new ImsCapabilities(((adps) this.a).c.a);
            case 1:
                Object obj = this.a;
                if (((Optional) obj).isPresent()) {
                    return new MalformedURLException("Config server url should be valid when making request. simId: ".concat(String.valueOf(advq.SIM_ID.c(obj))));
                }
                return new MalformedURLException("Config server url should be valid when making request.");
            case 2:
                Object obj2 = this.a;
                adpp adppVar = new adpp(obj2, 3);
                agmp agmpVar = (agmp) obj2;
                aglz cN = agmpVar.cN(adppVar);
                if (agmpVar.getPosition() == agmpVar.getCount() - 1) {
                    agmpVar.close();
                }
                return cN;
            case 3:
                return ((agmp) this.a).b();
            case 4:
                return ((agoz) this.a).t();
            case 5:
                return Boolean.valueOf(((agoz) this.a).K());
            case 6:
                return ((agoz) this.a).w();
            case 7:
                aiim aiimVar = (aiim) this.a;
                String str = (String) aiimVar.a;
                if (str.length() == 0 || str.length() > 32) {
                    ((alvg) agsv.a.a(agyk.a).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory$Builder", "checkLength", 445, "AutoCleanableDirectory.java")).B("The length of key (%s) must be >0 and <=%d", aiimVar.a, 32);
                }
                Object obj3 = aiimVar.b;
                ?? r0 = aiimVar.c;
                File cacheDir = ((Context) obj3).getCacheDir();
                alor ae = alzz.ae(r0);
                StringBuilder sb = new StringBuilder();
                sb.append(aiim.g("BundledEmojiListLoader"));
                aluq listIterator = ae.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    sb.append('|');
                    sb.append(albo.ap(((agsu) entry.getKey()).toString()));
                    sb.append('>');
                    sb.append(aiim.g((String) entry.getValue()));
                }
                String f = aiim.f(aiim.f(sb.toString(), '%'), '/');
                alvi alviVar = ahbi.a;
                String[] strArr = {"auto_clean", f};
                int i = 0;
                while (i < 2) {
                    File file = new File(cacheDir, strArr[i]);
                    i++;
                    cacheDir = file;
                }
                return new agsv(cacheDir, "BundledEmojiListLoader", ae);
            case 8:
                return new ajsl((Class) this.a);
            case 9:
                return String.valueOf(((akwj) this.a).a.d().hashCode());
            default:
                return new ExperimentalCronetEngine.Builder((Context) this.a);
        }
    }
}
