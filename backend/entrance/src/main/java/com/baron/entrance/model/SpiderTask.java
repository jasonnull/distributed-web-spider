package com.baron.entrance.model;

import com.baron.entrance.concurrent.WebDriverPool;
import org.eclipse.jetty.util.BlockingArrayQueue;
import org.springframework.data.annotation.Id;
import us.codecraft.webmagic.Spider;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;

/**
 * Created by Baron.Chen on 2017/6/9.
 */
public class SpiderTask {
    @Id
    private String id;
    private SpiderTemplate spiderTemplate;
    private Long successCount;
    private Long failedCount;
    private Date startedDate;
    private Date finishedDate;
    private Queue<UnitTask> unitTasks;
    private List<Integer> threadIds;
    private ExecutorService threadPool;
    private WebDriverPool webDriverPool;
    private Spider spider;
    private Map<Long, Log> logs;
    private State state;

    public SpiderTask() {
        unitTasks = new BlockingArrayQueue<>();
    }

    public SpiderTemplate getSpiderTemplate() {
        return spiderTemplate;
    }

    public void setSpiderTemplate(SpiderTemplate spiderTemplate) {
        this.spiderTemplate = spiderTemplate;
    }

    public Long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Long successCount) {
        this.successCount = successCount;
    }

    public Long getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public Date getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }

    public Queue<UnitTask> getUnitTasks() {
        return unitTasks;
    }

    public void setUnitTasks(BlockingQueue<UnitTask> unitTasks) {
        this.unitTasks = unitTasks;
    }

    public List<Integer> getThreadIds() {
        return threadIds;
    }

    public void setThreadIds(List<Integer> threadIds) {
        this.threadIds = threadIds;
    }

    public ExecutorService getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(ExecutorService threadPool) {
        this.threadPool = threadPool;
    }

    public WebDriverPool getWebDriverPool() {
        return webDriverPool;
    }

    public void setWebDriverPool(WebDriverPool webDriverPool) {
        this.webDriverPool = webDriverPool;
    }

    public Spider getSpider() {
        return spider;
    }

    public void setSpider(Spider spider) {
        this.spider = spider;
    }

    public Map<Long, Log> getLogs() {
        return logs;
    }

    public void setLogs(Map<Long, Log> logs) {
        this.logs = logs;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}