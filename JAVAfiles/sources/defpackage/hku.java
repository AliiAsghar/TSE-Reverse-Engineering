package defpackage;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hku extends hkd {
    private final Object m;
    private hki n;

    static {
        String.format("application/json; charset=%s", "utf-8");
    }

    public hku(String str, hki hkiVar, hkh hkhVar) {
        super(str, hkhVar);
        this.m = new Object();
        this.n = hkiVar;
    }

    @Override // defpackage.hkd
    public final void d() {
        super.d();
        synchronized (this.m) {
            this.n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hkd
    public final void e(Object obj) {
        hki hkiVar;
        synchronized (this.m) {
            hkiVar = this.n;
        }
        if (hkiVar != null) {
            hkiVar.a(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.hkd
    public final akju l(hka hkaVar) {
        String str;
        try {
            Object obj = hkaVar.c;
            ?? r2 = hkaVar.d;
            String str2 = "utf-8";
            if (r2 != 0 && (str = (String) r2.get(assi.a)) != null) {
                String[] split = str.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            return new akju(new JSONObject(new String((byte[]) obj, str2)), hlc.c(hkaVar));
        } catch (UnsupportedEncodingException e) {
            return new akju(new hkc(e));
        } catch (JSONException e2) {
            return new akju(new hkc(e2));
        }
    }
}
