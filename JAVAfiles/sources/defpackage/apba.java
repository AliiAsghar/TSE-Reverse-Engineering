package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class apba extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public apba(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = true;
    }

    public apba(String str) {
        super(str);
    }
}
