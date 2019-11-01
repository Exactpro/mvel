package org.mvel2.tests.classes;

import junit.framework.TestCase;
import org.mvel2.MVEL;
import org.mvel2.optimizers.OptimizerFactory;
import org.mvel2.tests.core.res.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import static org.mvel2.MVEL.compileExpression;
import static org.mvel2.MVEL.executeExpression;

/**
 * @author Mike Brock
 */
public class ClassTests extends TestCase {
  private static final Logger LOGGER = LoggerFactory.getLogger(ClassTests.class);
  private final String dir = "src/test/java/" + getClass().getPackage().getName().replaceAll("\\.", "/");

  public void testScript() throws IOException {
    MVEL.reset();
    OptimizerFactory.resetDefaultOptimizer();

    final Object o = MVEL.evalFile(new File(dir + "/demo.mvel"), new HashMap<String, Object>());
  }

}
