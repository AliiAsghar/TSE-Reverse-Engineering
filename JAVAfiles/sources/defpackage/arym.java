package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arym extends CancellationException implements arvz {
    public final transient arxm a;

    public arym(String str, arxm arxmVar) {
        super(str);
        this.a = arxmVar;
    }

    @Override // defpackage.arvz
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        arym arymVar = new arym(message, this.a);
        arymVar.initCause(this);
        return arymVar;
    }
}
