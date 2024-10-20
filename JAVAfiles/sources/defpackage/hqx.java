package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqx implements hyy {
    private final /* synthetic */ int a;

    public hqx(int i) {
        this.a = i;
    }

    public static final hqy b() {
        try {
            return new hqy(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.hyy
    public final /* synthetic */ Object a() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return new ArrayList();
            }
            return new hps();
        }
        return b();
    }
}
