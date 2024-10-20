package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajob extends ajny {
    static final long serialVersionUID = 1;

    public ajob() {
        super("Jibe SDK Service not available. Is the Jibe SDK service running? Did you call connect() and wait for the notification before calling an API function?");
    }

    public ajob(String str) {
        super(str + " not available. Is the " + str + " running? Did you call connect() and wait for the notification before calling an API function?");
    }
}
