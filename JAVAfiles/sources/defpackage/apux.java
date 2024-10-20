package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apux implements aput {
    private final Executor a;

    public apux(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.aput
    public final apvh a(String str, String str2, apuu apuuVar, apus apusVar) {
        try {
            return new apuw((HttpURLConnection) new URL(str).openConnection(), str2, apuuVar, apusVar, this.a);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }

    public apux() {
        this(null);
    }
}
