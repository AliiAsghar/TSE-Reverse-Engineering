package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmv implements kni {
    private static final xze a = xze.f("BugleDiagnostics", kni.class);
    private final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);
    private final Context c;
    private final yep d;
    private final xnv e;
    private xza f;
    private String g;

    public kmv(Context context, yep yepVar, xnv xnvVar) {
        this.c = context;
        this.d = yepVar;
        this.e = xnvVar;
    }

    @Override // defpackage.kni
    public final Uri a() {
        String str = this.g;
        if (str == null) {
            a.o("no recent diagnostics logs");
            return null;
        }
        File e = uti.e(this.c, str);
        if (!e.exists()) {
            try {
                PrintWriter printWriter = new PrintWriter(e);
                try {
                    this.f.b(printWriter, xzc.DIAGNOSTICS);
                    printWriter.close();
                } finally {
                }
            } catch (FileNotFoundException e2) {
                a.n("destination file not found", e2);
                return null;
            }
        }
        return uti.d(this.c, this.g);
    }

    @Override // defpackage.kni
    public final xza b() {
        return this.f;
    }

    @Override // defpackage.kni
    public final void c() {
        String concat = "AMDiagnostics".concat(String.valueOf(this.b.format(Long.valueOf(this.e.f().toEpochMilli()))));
        this.g = concat;
        this.f = xza.a(this.c, this.d, concat, "BugleDiagnostics");
    }

    @Override // defpackage.kni
    public final boolean d() {
        if (this.g != null) {
            return true;
        }
        return false;
    }
}
