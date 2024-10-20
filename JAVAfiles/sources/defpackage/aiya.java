package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiya implements armf {
    private static final Charset d;
    private static final List e;
    public volatile aixz c;
    private final String f;
    public final Object b = new Object();
    public final Map a = new HashMap(10);

    static {
        new aiya("");
        d = Charset.forName("UTF-8");
        e = new ArrayList();
    }

    private aiya(String str) {
        this.f = str;
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(d));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized aiya c() {
        synchronized (aiya.class) {
            for (aiya aiyaVar : e) {
                if (aiyaVar.f.equals("tq_cobalt")) {
                    return aiyaVar;
                }
            }
            aiya aiyaVar2 = new aiya("tq_cobalt");
            e.add(aiyaVar2);
            return aiyaVar2;
        }
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        return this.c;
    }

    public final aixy d(String str, aixw... aixwVarArr) {
        synchronized (this.b) {
            aixy aixyVar = (aixy) this.a.get(str);
            if (aixyVar != null) {
                if (Arrays.equals(aixyVar.d, aixwVarArr)) {
                    return aixyVar;
                }
                throw new aiyb("Streamz " + aixyVar.c + " with field diffs: " + Arrays.toString(aixyVar.d) + " and " + Arrays.toString(aixwVarArr));
            }
            aixy aixyVar2 = new aixy(str, this, aixwVarArr);
            this.a.put(aixyVar2.c, aixyVar2);
            return aixyVar2;
        }
    }
}
