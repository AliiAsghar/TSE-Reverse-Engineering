package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.aodq;
import defpackage.aodr;
import defpackage.aods;
import defpackage.aodt;
import defpackage.aoem;
import defpackage.aoen;
import defpackage.aofa;
import defpackage.aofd;
import defpackage.aofg;
import defpackage.aofp;
import defpackage.aofs;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final aofa a = new aofa(new aofd(2));
    public static final aofa b = new aofa(new aofd(3));
    public static final aofa c = new aofa(new aofd(4));
    static final aofa d = new aofa(new aofd(5));

    public static ScheduledExecutorService a(ExecutorService executorService) {
        return new aofp(executorService, (ScheduledExecutorService) d.a());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<aoen<?>> getComponents() {
        aoem aoemVar = new aoem(new aofg(aodq.class, ScheduledExecutorService.class), new aofg(aodq.class, ExecutorService.class), new aofg(aodq.class, Executor.class));
        aoemVar.c = new aofs(1);
        aoem aoemVar2 = new aoem(new aofg(aodr.class, ScheduledExecutorService.class), new aofg(aodr.class, ExecutorService.class), new aofg(aodr.class, Executor.class));
        aoemVar2.c = new aofs(0);
        aoem aoemVar3 = new aoem(new aofg(aods.class, ScheduledExecutorService.class), new aofg(aods.class, ExecutorService.class), new aofg(aods.class, Executor.class));
        aoemVar3.c = new aofs(2);
        aoem a2 = aoen.a(new aofg(aodt.class, Executor.class));
        a2.c = new aofs(3);
        return Arrays.asList(aoemVar.a(), aoemVar2.a(), aoemVar3.a(), a2.a());
    }
}
