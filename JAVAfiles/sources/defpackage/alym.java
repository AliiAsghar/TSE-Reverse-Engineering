package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alym extends LogRecord {
    private static final Object[] b;
    public final alxr a;
    private final alwv c;

    static {
        new alyl();
        b = new Object[0];
    }

    protected alym(alwv alwvVar, alxa alxaVar) {
        super(alwvVar.m(), null);
        this.c = alwvVar;
        this.a = alxr.g(alxaVar, alwvVar.i());
        alvr e = alwvVar.e();
        setSourceClassName(e.b());
        setSourceMethodName(e.d());
        setLoggerName(alwvVar.l());
        setMillis(TimeUnit.NANOSECONDS.toMillis(alwvVar.d()));
        super.setParameters(b);
    }

    public static void a(alwv alwvVar, StringBuilder sb) {
        sb.append("  original message: ");
        if (alwvVar.j() == null) {
            sb.append(alwy.b(alwvVar.k()));
        } else {
            sb.append(alwvVar.j().b);
            sb.append("\n  original arguments:");
            for (Object obj : alwvVar.T()) {
                sb.append("\n    ");
                sb.append(alwy.b(obj));
            }
        }
        alxa i = alwvVar.i();
        if (i.b() > 0) {
            sb.append("\n  metadata:");
            for (int i2 = 0; i2 < i.b(); i2++) {
                sb.append("\n    ");
                sb.append(i.c(i2).a);
                sb.append(": ");
                sb.append(alwy.b(i.e(i2)));
            }
        }
        sb.append("\n  level: ");
        sb.append(alwy.b(alwvVar.m()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(alwvVar.d());
        sb.append("\n  class: ");
        sb.append(alwvVar.e().b());
        sb.append("\n  method: ");
        sb.append(alwvVar.e().d());
        sb.append("\n  line number: ");
        sb.append(alwvVar.e().a());
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message != null) {
            return message;
        }
        String a = alxw.b.a(this.c, this.a);
        super.setMessage(a);
        return a;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        if (getParameters() != null) {
            obj = Arrays.asList(getParameters());
        } else {
            obj = "<none>";
        }
        sb.append(obj);
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    public alym(alwv alwvVar, alxa alxaVar, byte[] bArr) {
        this(alwvVar, alxaVar);
        setThrown((Throwable) this.a.b(alvm.a));
        getMessage();
    }

    public alym(RuntimeException runtimeException, alwv alwvVar, alxa alxaVar) {
        this(alwvVar, alxaVar);
        setLevel(alwvVar.m().intValue() < Level.WARNING.intValue() ? Level.WARNING : alwvVar.m());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        a(alwvVar, sb);
        setMessage(sb.toString());
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }
}
