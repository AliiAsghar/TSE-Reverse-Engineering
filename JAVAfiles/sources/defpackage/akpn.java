package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class akpn implements akry {
    private final akry a;
    private final UUID b;
    private final String c;
    private Thread d;
    private aktx e;

    public akpn(String str, akry akryVar, akru akruVar) {
        str.getClass();
        this.c = str;
        this.a = akryVar;
        this.b = akryVar.e();
        aktx aktxVar = akruVar.e;
        if (aktxVar == null) {
            this.e = null;
            this.d = Thread.currentThread();
        } else {
            this.e = aktxVar;
            this.d = null;
        }
    }

    @Override // defpackage.akry
    public final akry a() {
        return this.a;
    }

    @Override // defpackage.akry
    public final aktx b() {
        return this.e;
    }

    @Override // defpackage.akry
    public final String c() {
        return this.c;
    }

    @Override // defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        akqj.o(this);
        this.d = null;
        this.e = null;
    }

    @Override // defpackage.akry
    public final Thread d() {
        return this.d;
    }

    @Override // defpackage.akry
    public final UUID e() {
        return this.b;
    }

    public final String toString() {
        return akqj.n(this);
    }

    public akpn(String str, UUID uuid, akru akruVar) {
        str.getClass();
        this.c = str;
        Thread thread = null;
        this.a = null;
        this.b = uuid;
        aktx aktxVar = akruVar.e;
        if (aktxVar == null) {
            this.e = null;
            thread = Thread.currentThread();
        } else {
            this.e = aktxVar;
        }
        this.d = thread;
    }
}
